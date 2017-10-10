package thinkreed.ratlist

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by thinkreed on 2017/10/7.
 */
abstract class MvpAdapter : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(onCreateViewGroupPresenter(parent, viewType))
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
    }

    abstract fun onCreateViewGroupPresenter(parent: ViewGroup?, viewType: Int): ModelViewGroupPresenter?
}