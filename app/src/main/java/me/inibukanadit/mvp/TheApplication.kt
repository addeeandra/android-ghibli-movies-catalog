package me.inibukanadit.mvp

import android.app.Application
import me.inibukanadit.ghibliapi.GhibliApi

class TheApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        GhibliApi.init(this)
    }

}