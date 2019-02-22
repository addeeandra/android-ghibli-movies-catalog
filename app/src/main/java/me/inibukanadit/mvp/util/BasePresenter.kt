package me.inibukanadit.mvp.util

import kotlinx.coroutines.CoroutineScope

interface BasePresenter : CoroutineScope {

    fun start()

}