package me.inibukanadit.ghibliapi.remote.retrofit.interceptor

import android.content.Context
import me.inibukanadit.ghibliapi.utils.Utility
import okhttp3.Interceptor
import okhttp3.Response

class CacheRequestInterceptor(private val mCtx: Context) : Interceptor {

    private val mOnlineCacheStoreExpired = 5
    private val mOfflineCacheStoreExpired = 60 * 60 * 24 * 7

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().apply {
            if (Utility.hasNetwork(mCtx)) newBuilder()
                .addHeader("Cache-Control", "public, max-age=$mOnlineCacheStoreExpired")
                .build()
            else newBuilder()
                .addHeader("Cache-Control", "public, only-if-cached, max-stale=$mOfflineCacheStoreExpired")
                .build()
        }
        return chain.proceed(request)
    }

}