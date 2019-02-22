package me.inibukanadit.ghibliapi.remote.retrofit

import kotlinx.coroutines.Deferred
import me.inibukanadit.ghibliapi.remote.response.*
import retrofit2.http.GET
import retrofit2.http.Path

internal interface RetrofitEndpoint {

    @GET("films")
    fun getAllFilmsAsync(): Deferred<List<FilmData>>

    @GET("films/{id}")
    fun getFilmDetailAsync(@Path("id") id: String): Deferred<FilmData>

    @GET("people")
    fun getAllPeopleAsync(): Deferred<List<PeopleData>>

    @GET("people/{id}")
    fun getPeopleDetailAsync(@Path("id") id: String): Deferred<PeopleData>

    @GET("species")
    fun getAllSpeciesAsync(): Deferred<List<SpeciesData>>

    @GET("species/{id}")
    fun getSpeciesDetailAsync(@Path("id") id: String): Deferred<SpeciesData>

    @GET("vehicles")
    fun getAllVehiclesAsync(): Deferred<List<VehicleData>>

    @GET("vehicles/{id}")
    fun getVehicleDetailAsync(@Path("id") id: String): Deferred<VehicleData>

    @GET("locations")
    fun getAllLocationsAsync(): Deferred<List<LocationData>>

    @GET("locations/{id}")
    fun getLocationDetailAsync(@Path("id") id: String): Deferred<LocationData>

}