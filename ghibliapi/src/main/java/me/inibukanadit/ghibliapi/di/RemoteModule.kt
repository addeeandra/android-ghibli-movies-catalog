package me.inibukanadit.ghibliapi.di

import me.inibukanadit.ghibliapi.remote.GhibliRemoteProvider
import me.inibukanadit.ghibliapi.remote.GhibliRemoteService
import me.inibukanadit.ghibliapi.remote.retrofit.RetrofitProvider
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module

val remoteModule = module(override = true) {

    single<GhibliRemoteProvider> { RetrofitProvider.instance() }

    single { get<GhibliRemoteProvider>().create(androidContext()) as GhibliRemoteService }

}