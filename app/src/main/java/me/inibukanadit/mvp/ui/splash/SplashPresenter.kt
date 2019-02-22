package me.inibukanadit.mvp.ui.splash

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class SplashPresenter(
    private val mView: SplashContract.View,
    override val coroutineContext: CoroutineContext = Dispatchers.Main
) : SplashContract.Presenter {

    private val mSplashDelay = 1500.toLong()

    init {
        mView.setPresenter(this)
    }

    override fun start() {
        launch {
            delay(mSplashDelay)
            mView.showMovieListPage()
        }
    }

}