package me.inibukanadit.mvp.util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter<T, VH : BaseViewHolder<T>>(val items: MutableList<T>) : RecyclerView.Adapter<VH>() {

    abstract fun getLayoutId(): Int

    abstract fun onCreateViewHolder(view: View): VH

    abstract fun onBindViewHolder(holder: VH, data: T, position: Int)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH = onCreateViewHolder(
        LayoutInflater.from(parent.context).inflate(getLayoutId(), parent, false)
    )

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: VH, position: Int) {
        onBindViewHolder(holder, items[position], position)
    }

}