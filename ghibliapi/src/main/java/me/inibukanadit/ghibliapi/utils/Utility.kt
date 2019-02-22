package me.inibukanadit.ghibliapi.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

object Utility {

    fun hasNetwork(ctx: Context): Boolean {
        var isConnected = false
        val connectivityManager = ctx.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = connectivityManager.activeNetworkInfo
        if (activeNetwork != null && activeNetwork.isConnected) isConnected = true
        return isConnected
    }

}