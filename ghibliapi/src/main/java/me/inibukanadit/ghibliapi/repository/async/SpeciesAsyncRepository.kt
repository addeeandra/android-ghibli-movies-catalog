package me.inibukanadit.ghibliapi.repository.async

import me.inibukanadit.ghibliapi.remote.response.SpeciesData

class SpeciesAsyncRepository : AsyncRepository<SpeciesData>() {

    override suspend fun loadAll(): List<SpeciesData> = remoteService.getAllSpeciesAsync().await()

    override suspend fun loadSingle(id: String): SpeciesData = remoteService.getSpeciesDetailAsync(id).await()

}