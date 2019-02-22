package me.inibukanadit.mvp.ui.movieDetail

import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.layout_movie_detail.*
import me.inibukanadit.ghibliapi.repository.callback.FilmCallbackRepository
import me.inibukanadit.mvp.R
import me.inibukanadit.mvp.util.BaseActivity

class MovieDetailActivity : BaseActivity() {

    companion object {
        const val MOVIE_ID_EXTRA = "extra.movie_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_movie_detail)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val movieId = intent.getStringExtra(MOVIE_ID_EXTRA)

        FilmCallbackRepository().loadSingle(movieId) { movie ->
            tv_movie_title.text = movie.title
            tv_movie_description.text = movie.description
            tv_movie_producer.text = movie.producer
            tv_movie_director.text = movie.director
            tv_movie_release.text = movie.releaseDate
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return if (item?.itemId == android.R.id.home) {
            finish()
            true
        } else super.onOptionsItemSelected(item)
    }

}