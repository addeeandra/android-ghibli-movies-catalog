package me.inibukanadit.ghibliapi.repository.async

import me.inibukanadit.ghibliapi.remote.response.LocationData

class LocationAsyncRepository : AsyncRepository<LocationData>() {

    override suspend fun loadAll(): List<LocationData> = remoteService.getAllLocationsAsync().await()

    override suspend fun loadSingle(id: String): LocationData = remoteService.getLocationDetailAsync(id).await()

}