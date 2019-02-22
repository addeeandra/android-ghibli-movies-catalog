package me.inibukanadit.ghibliapi.repository.callback

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import me.inibukanadit.ghibliapi.repository.CallbackDataSource
import me.inibukanadit.ghibliapi.repository.async.AsyncRepository
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject
import kotlin.coroutines.CoroutineContext

abstract class CallbackRepository<T> : CallbackDataSource(), KoinComponent, CoroutineScope {

    override val coroutineContext: CoroutineContext = Dispatchers.IO

    protected val asyncRepository by inject<AsyncRepository<T>>()

    fun loadAll(callback: CallbackDataSource.DataSourceCallback<List<T>>) {
        launch { callback.onLoaded(asyncRepository.loadAll()) }
    }

    fun loadSingle(id: String, callback: CallbackDataSource.DataSourceCallback<T>) {
        launch { callback.onLoaded(asyncRepository.loadSingle(id)) }
    }

}