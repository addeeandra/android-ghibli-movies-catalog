package me.inibukanadit.ghibliapi.repository.async

import me.inibukanadit.ghibliapi.remote.response.FilmData

class FilmAsyncRepository : AsyncRepository<FilmData>() {

    override suspend fun loadAll(): List<FilmData> = remoteService.getAllFilmsAsync().await()

    override suspend fun loadSingle(id: String): FilmData = remoteService.getFilmDetailAsync(id).await()

}