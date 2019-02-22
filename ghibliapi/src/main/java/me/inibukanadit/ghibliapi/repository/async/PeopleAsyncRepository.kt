package me.inibukanadit.ghibliapi.repository.async

import me.inibukanadit.ghibliapi.remote.response.PeopleData

class PeopleAsyncRepository : AsyncRepository<PeopleData>() {

    override suspend fun loadAll(): List<PeopleData> = remoteService.getAllPeopleAsync().await()

    override suspend fun loadSingle(id: String): PeopleData = remoteService.getPeopleDetailAsync(id).await()

}