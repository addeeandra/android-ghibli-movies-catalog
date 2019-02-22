package me.inibukanadit.ghibliapi.di

import me.inibukanadit.ghibliapi.remote.response.*
import me.inibukanadit.ghibliapi.repository.async.*
import me.inibukanadit.ghibliapi.repository.callback.*
import org.koin.dsl.module.module

val repositoryModule = module {

    single<AsyncRepository<FilmData>>("asyncRepoFilm") { FilmAsyncRepository() }
    single<AsyncRepository<LocationData>>("asyncRepoLocation") { LocationAsyncRepository() }
    single<AsyncRepository<PeopleData>>("asyncRepoPeople") { PeopleAsyncRepository() }
    single<AsyncRepository<SpeciesData>>("asyncRepoSpecies") { SpeciesAsyncRepository() }
    single<AsyncRepository<VehicleData>>("asyncRepoVehicle") { VehicleAsyncRepository() }

    single<CallbackRepository<FilmData>>("callbackRepoFilm") { FilmCallbackRepository() }
    single<CallbackRepository<LocationData>>("callbackRepoLocation") { LocationCallbackRepository() }
    single<CallbackRepository<PeopleData>>("callbackRepoPeople") { PeopleCallbackRepository() }
    single<CallbackRepository<SpeciesData>>("callbackRepoSpecies") { SpeciesCallbackRepository() }
    single<CallbackRepository<VehicleData>>("callbackRepoVehicle") { VehicleCallbackRepository() }

}