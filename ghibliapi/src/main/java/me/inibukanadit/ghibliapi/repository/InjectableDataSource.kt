package me.inibukanadit.ghibliapi.repository

import me.inibukanadit.ghibliapi.remote.GhibliRemoteService
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

abstract class InjectableDataSource : KoinComponent {

    protected val remoteService by inject<GhibliRemoteService>()

}