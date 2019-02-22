package me.inibukanadit.ghibliapi.remote.retrofit

import android.annotation.SuppressLint
import android.content.Context
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import me.inibukanadit.ghibliapi.BuildConfig
import me.inibukanadit.ghibliapi.remote.GhibliRemoteProvider
import me.inibukanadit.ghibliapi.remote.retrofit.interceptor.CacheRequestInterceptor
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal class RetrofitProvider : GhibliRemoteProvider {

    companion object {

        @SuppressLint("StaticFieldLeak")
        private var sInstance: RetrofitProvider? = null

        @Synchronized
        fun instance(): RetrofitProvider {
            if (sInstance == null) {
                sInstance = RetrofitProvider()
            }
            return sInstance as RetrofitProvider
        }

    }

    private val mCacheSize = (5 * 1024 * 1024)
        .toLong() // 5 MB

    private val mLogger =
        HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)

    override fun create(ctx: Context?) =
        ctx?.let { RetrofitService(builder(it).create(RetrofitEndpoint::class.java)) }

    private fun builder(ctx: Context) =
        Retrofit
            .Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory.invoke())
            .client(client(ctx))
            .build()

    private fun client(ctx: Context) = OkHttpClient
        .Builder()
        .cache(Cache(ctx.cacheDir, mCacheSize))
        .addInterceptor(CacheRequestInterceptor(ctx))
        .apply { if (BuildConfig.DEBUG) addInterceptor(mLogger) }
        .build()

}