package me.inibukanadit.mvp.ui.splash

import me.inibukanadit.mvp.util.BasePresenter
import me.inibukanadit.mvp.util.BaseView

interface SplashContract {

    interface View : BaseView<Presenter> {

        fun showMovieListPage()

    }

    interface Presenter : BasePresenter

}