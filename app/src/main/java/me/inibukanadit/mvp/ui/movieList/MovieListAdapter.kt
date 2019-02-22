package me.inibukanadit.mvp.ui.movieList

import android.view.View
import kotlinx.android.synthetic.main.item_movie.view.*
import me.inibukanadit.ghibliapi.remote.response.FilmData
import me.inibukanadit.mvp.R
import me.inibukanadit.mvp.util.BaseAdapter
import me.inibukanadit.mvp.util.BaseViewHolder

class MovieListAdapter(
    items: MutableList<FilmData>,
    private val mClickListener: (movie: FilmData, position: Int) -> Unit
) : BaseAdapter<FilmData, MovieListAdapter.MovieVH>(items) {

    override fun getLayoutId(): Int = R.layout.item_movie

    override fun onCreateViewHolder(view: View): MovieVH = MovieVH(view)

    override fun onBindViewHolder(holder: MovieVH, data: FilmData, position: Int) {
        holder.itemView.tv_movie_title.text = data.title
        holder.itemView.tv_movie_description.text = data.description
        holder.itemView.setOnClickListener { mClickListener(data, position) }
    }

    class MovieVH(view: View) : BaseViewHolder<FilmData>(view)

}