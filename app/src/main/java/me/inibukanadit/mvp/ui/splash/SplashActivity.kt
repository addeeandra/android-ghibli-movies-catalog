package me.inibukanadit.mvp.ui.splash

import android.content.Intent
import android.os.Bundle
import me.inibukanadit.mvp.R
import me.inibukanadit.mvp.ui.movieList.MovieListActivity
import me.inibukanadit.mvp.util.BaseActivity

class SplashActivity : BaseActivity(), SplashContract.View {

    private lateinit var mPresenter: SplashContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_splash)

        SplashPresenter(this)
    }

    override fun onStart() {
        super.onStart()
        mPresenter.start()
    }

    override fun setPresenter(presenter: SplashContract.Presenter) {
        mPresenter = presenter
    }

    override fun showMovieListPage() {
        startActivity(Intent(this, MovieListActivity::class.java))
    }

}