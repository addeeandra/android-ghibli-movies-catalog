package me.inibukanadit.mvp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.inibukanadit.ghibliapi.remote.response.FilmData
import me.inibukanadit.ghibliapi.repository.callback.FilmCallbackRepository

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FilmCallbackRepository().loadAll { data: List<FilmData> ->
            println(data)
        }
    }

}
