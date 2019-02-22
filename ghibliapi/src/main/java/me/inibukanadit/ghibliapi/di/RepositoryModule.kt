package me.inibukanadit.ghibliapi.di

import me.inibukanadit.ghibliapi.remote.response.*
import me.inibukanadit.ghibliapi.repository.async.*
import me.inibukanadit.ghibliapi.repository.callback.*
import org.koin.dsl.module.module

val repositoryModule = module {

    single { FilmAsyncRepository() as AsyncRepository<FilmData> }
    single { LocationAsyncRepository() as AsyncRepository<LocationData> }
    single { PeopleAsyncRepository() as AsyncRepository<PeopleData> }
    single { SpeciesAsyncRepository() as AsyncRepository<SpeciesData> }
    single { VehicleAsyncRepository() as AsyncRepository<VehicleData> }

    single { FilmCallbackRepository() as CallbackRepository<FilmData> }
    single { LocationCallbackRepository() as CallbackRepository<LocationData> }
    single { PeopleCallbackRepository() as CallbackRepository<PeopleData> }
    single { SpeciesCallbackRepository() as CallbackRepository<SpeciesData> }
    single { VehicleCallbackRepository() as CallbackRepository<VehicleData> }

}