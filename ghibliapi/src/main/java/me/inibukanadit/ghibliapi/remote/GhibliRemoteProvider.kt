package me.inibukanadit.ghibliapi.remote

import android.content.Context

internal interface GhibliRemoteProvider {

    fun create(ctx: Context? = null): GhibliRemoteService?

}