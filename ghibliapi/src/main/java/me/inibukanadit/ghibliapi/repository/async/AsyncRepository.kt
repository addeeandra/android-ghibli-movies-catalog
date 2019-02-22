package me.inibukanadit.ghibliapi.repository.async

import me.inibukanadit.ghibliapi.repository.AsyncDataSource

abstract class AsyncRepository<T> : AsyncDataSource() {

    abstract suspend fun loadAll(): List<T>

    abstract suspend fun loadSingle(id: String): T

}