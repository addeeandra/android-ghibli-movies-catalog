package me.inibukanadit.ghibliapi.repository.async

import me.inibukanadit.ghibliapi.remote.response.VehicleData

class VehicleAsyncRepository : AsyncRepository<VehicleData>() {

    override suspend fun loadAll(): List<VehicleData> = remoteService.getAllVehiclesAsync().await()

    override suspend fun loadSingle(id: String): VehicleData = remoteService.getVehicleDetailAsync(id).await()

}