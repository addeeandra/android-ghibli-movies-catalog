package me.inibukanadit.ghibliapi.remote

import kotlinx.coroutines.Deferred
import me.inibukanadit.ghibliapi.remote.response.*
import retrofit2.http.GET

internal interface GhibliService {

    @GET("films")
    fun getAllFilms(): Deferred<List<FilmData>>

    @GET("films/{id}")
    fun getFilmDetail(): Deferred<FilmData>

    @GET("people")
    fun getAllPeople(): Deferred<List<PeopleData>>

    @GET("people/{id}")
    fun getPeopleDetail(): Deferred<PeopleData>

    @GET("species")
    fun getAllSpecies(): Deferred<List<SpeciesData>>

    @GET("species/{id}")
    fun getSpeciesDetail(): Deferred<SpeciesData>

    @GET("vehicles")
    fun getAllVehicles(): Deferred<List<VehicleData>>

    @GET("vehicles/{id}")
    fun getVehicleDetail(): Deferred<VehicleData>

    @GET("locations")
    fun getAllLocations(): Deferred<List<LocationData>>

    @GET("locations/{id}")
    fun getLocationDetail(): Deferred<LocationData>

}