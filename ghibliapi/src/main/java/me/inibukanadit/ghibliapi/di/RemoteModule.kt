package me.inibukanadit.ghibliapi.di

import me.inibukanadit.ghibliapi.remote.GhibliRemoteProvider
import me.inibukanadit.ghibliapi.remote.GhibliRemoteService
import me.inibukanadit.ghibliapi.remote.response.*
import me.inibukanadit.ghibliapi.remote.retrofit.RetrofitProvider
import me.inibukanadit.ghibliapi.repository.async.*
import me.inibukanadit.ghibliapi.repository.callback.*
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module

val remoteModule = module {

    single { RetrofitProvider.instance() as GhibliRemoteProvider }
    single { get<GhibliRemoteProvider>().create(androidContext()) as GhibliRemoteService }

}