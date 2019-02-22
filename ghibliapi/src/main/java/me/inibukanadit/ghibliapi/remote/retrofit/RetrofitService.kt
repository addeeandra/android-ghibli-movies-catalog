package me.inibukanadit.ghibliapi.remote.retrofit

import kotlinx.coroutines.Deferred
import me.inibukanadit.ghibliapi.remote.GhibliRemoteService
import me.inibukanadit.ghibliapi.remote.response.*

internal class RetrofitService(private val mEndpoint: RetrofitEndpoint) : GhibliRemoteService {

    override fun getAllFilmsAsync(): Deferred<List<FilmData>> {
        return mEndpoint.getAllFilmsAsync()
    }

    override fun getFilmDetailAsync(id: String): Deferred<FilmData> {
        return mEndpoint.getFilmDetailAsync(id)
    }

    override fun getAllPeopleAsync(): Deferred<List<PeopleData>> {
        return mEndpoint.getAllPeopleAsync()
    }

    override fun getPeopleDetailAsync(id: String): Deferred<PeopleData> {
        return mEndpoint.getPeopleDetailAsync(id)
    }

    override fun getAllSpeciesAsync(): Deferred<List<SpeciesData>> {
        return mEndpoint.getAllSpeciesAsync()
    }

    override fun getSpeciesDetailAsync(id: String): Deferred<SpeciesData> {
        return mEndpoint.getSpeciesDetailAsync(id)
    }

    override fun getAllVehiclesAsync(): Deferred<List<VehicleData>> {
        return mEndpoint.getAllVehiclesAsync()
    }

    override fun getVehicleDetailAsync(id: String): Deferred<VehicleData> {
        return mEndpoint.getVehicleDetailAsync(id)
    }

    override fun getAllLocationsAsync(): Deferred<List<LocationData>> {
        return mEndpoint.getAllLocationsAsync()
    }

    override fun getLocationDetailAsync(id: String): Deferred<LocationData> {
        return mEndpoint.getLocationDetailAsync(id)
    }

}