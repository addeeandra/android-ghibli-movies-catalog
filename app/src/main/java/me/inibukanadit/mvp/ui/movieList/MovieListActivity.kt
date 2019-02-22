package me.inibukanadit.mvp.ui.movieList

import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.layout_movie_list.*
import me.inibukanadit.ghibliapi.repository.callback.FilmCallbackRepository
import me.inibukanadit.mvp.R
import me.inibukanadit.mvp.ui.movieDetail.MovieDetailActivity
import me.inibukanadit.mvp.util.BaseActivity

class MovieListActivity : BaseActivity() {

    private val mMovieListAdapter by lazy {
        MovieListAdapter(mutableListOf()) { movie, _ ->
            startActivity(Intent(this, MovieDetailActivity::class.java).apply {
                putExtra(MovieDetailActivity.MOVIE_ID_EXTRA, movie.id)
            })
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_movie_list)

        rv_movie_list.layoutManager = LinearLayoutManager(this)
        rv_movie_list.adapter = mMovieListAdapter

        FilmCallbackRepository().loadAll { result ->
            with(mMovieListAdapter) {
                items.clear()
                items.addAll(result)
                notifyDataSetChanged()
            }
        }
    }

}