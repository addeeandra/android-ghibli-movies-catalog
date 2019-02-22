package me.inibukanadit.ghibliapi.remote

import kotlinx.coroutines.Deferred
import me.inibukanadit.ghibliapi.remote.response.*

interface GhibliRemoteService {

    fun getAllFilmsAsync(): Deferred<List<FilmData>>

    fun getFilmDetailAsync(id: String): Deferred<FilmData>

    fun getAllPeopleAsync(): Deferred<List<PeopleData>>

    fun getPeopleDetailAsync(id: String): Deferred<PeopleData>

    fun getAllSpeciesAsync(): Deferred<List<SpeciesData>>

    fun getSpeciesDetailAsync(id: String): Deferred<SpeciesData>

    fun getAllVehiclesAsync(): Deferred<List<VehicleData>>

    fun getVehicleDetailAsync(id: String): Deferred<VehicleData>

    fun getAllLocationsAsync(): Deferred<List<LocationData>>

    fun getLocationDetailAsync(id: String): Deferred<LocationData>

}