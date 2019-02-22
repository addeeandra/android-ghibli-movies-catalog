package me.inibukanadit.ghibliapi.repository

abstract class CallbackDataSource : InjectableDataSource() {

    interface DataSourceCallback<T> {

        fun onLoaded(data: T)

    }

}