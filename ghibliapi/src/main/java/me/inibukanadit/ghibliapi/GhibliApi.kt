package me.inibukanadit.ghibliapi

import android.app.Application
import org.koin.android.ext.android.startKoin

object GhibliApi {

    fun init(application: Application) {
        application.startKoin(application.applicationContext, listOf(
            // TODO add modules here
        ))
    }

}