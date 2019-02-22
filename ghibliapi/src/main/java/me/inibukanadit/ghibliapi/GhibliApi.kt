package me.inibukanadit.ghibliapi

import android.app.Application
import me.inibukanadit.ghibliapi.di.remoteModule
import me.inibukanadit.ghibliapi.di.repositoryModule
import org.koin.android.ext.android.startKoin

object GhibliApi {

    fun init(application: Application) {
        application.startKoin(application.applicationContext, listOf(remoteModule, repositoryModule))
    }

}