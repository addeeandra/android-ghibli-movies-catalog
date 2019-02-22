package me.inibukanadit.ghibliapi.repository

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

abstract class AsyncDataSource : InjectableDataSource(), CoroutineScope {

    override val coroutineContext: CoroutineContext = Dispatchers.IO

}