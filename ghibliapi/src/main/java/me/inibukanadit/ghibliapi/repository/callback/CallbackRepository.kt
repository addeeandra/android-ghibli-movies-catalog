package me.inibukanadit.ghibliapi.repository.callback

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import me.inibukanadit.ghibliapi.repository.CallbackDataSource
import me.inibukanadit.ghibliapi.repository.async.AsyncRepository
import org.koin.standalone.inject
import kotlin.coroutines.CoroutineContext

abstract class CallbackRepository<T>(asyncModuleName: String = "") : CallbackDataSource(), CoroutineScope {

    override val coroutineContext: CoroutineContext = Dispatchers.IO

    private val mAsyncRepository by inject<AsyncRepository<T>>(asyncModuleName)

    fun loadAll(callback: (List<T>) -> Unit) {
        loadAll(object : DataSourceCallback<List<T>> {
            override fun onLoaded(data: List<T>) {
                callback(data)
            }
        })
    }

    fun loadSingle(id: String, callback: (T) -> Unit) {
        loadSingle(id, object : DataSourceCallback<T> {
            override fun onLoaded(data: T) {
                callback(data)
            }
        })
    }

    fun loadAll(callback: CallbackDataSource.DataSourceCallback<List<T>>) {
        launch { callback.onLoaded(mAsyncRepository.loadAll()) }
    }

    fun loadSingle(id: String, callback: CallbackDataSource.DataSourceCallback<T>) {
        launch { callback.onLoaded(mAsyncRepository.loadSingle(id)) }
    }

}