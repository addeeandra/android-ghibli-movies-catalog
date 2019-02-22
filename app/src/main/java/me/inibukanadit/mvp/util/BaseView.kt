package me.inibukanadit.mvp.util

interface BaseView<P : BasePresenter> {

    fun setPresenter(presenter: P)

}