package me.inibukanadit.ghibliapi.remote.retrofit

import kotlinx.coroutines.Deferred
import me.inibukanadit.ghibliapi.remote.GhibliRemoteService
import me.inibukanadit.ghibliapi.remote.response.*
import retrofit2.http.GET
import retrofit2.http.Path

internal interface RetrofitService : GhibliRemoteService {

    @GET("films")
    override fun getAllFilmsAsync(): Deferred<List<FilmData>>

    @GET("films/{id}")
    override fun getFilmDetailAsync(@Path("id") id: String): Deferred<FilmData>

    @GET("people")
    override fun getAllPeopleAsync(): Deferred<List<PeopleData>>

    @GET("people/{id}")
    override fun getPeopleDetailAsync(@Path("id") id: String): Deferred<PeopleData>

    @GET("species")
    override fun getAllSpeciesAsync(): Deferred<List<SpeciesData>>

    @GET("species/{id}")
    override fun getSpeciesDetailAsync(@Path("id") id: String): Deferred<SpeciesData>

    @GET("vehicles")
    override fun getAllVehiclesAsync(): Deferred<List<VehicleData>>

    @GET("vehicles/{id}")
    override fun getVehicleDetailAsync(@Path("id") id: String): Deferred<VehicleData>

    @GET("locations")
    override fun getAllLocationsAsync(): Deferred<List<LocationData>>

    @GET("locations/{id}")
    override fun getLocationDetailAsync(@Path("id") id: String): Deferred<LocationData>

}