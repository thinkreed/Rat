package thinkreed.ratlist

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by thinkreed on 2017/9/28.
 */
class MvpRecyclerView(context: Context) : RecyclerView(context) {

    class ViewHolder(viewGroupPresenter: ViewGroupPresenter<Model>) : RecyclerView.ViewHolder(viewGroupPresenter.view) {

    }

    abstract class MvpAdapter : Adapter<ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
            return ViewHolder(onCreateViewGroupPresenter(parent, viewType))
        }

        override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        }

        abstract fun onCreateViewGroupPresenter(parent: ViewGroup?, viewType: Int):ViewGroupPresenter<Model>
    }
}