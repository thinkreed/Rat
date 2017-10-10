package thinkreed.ratlist

import android.view.ViewGroup

/**
 * Created by thinkreed on 2017/10/8.
 */
class ListAdapter : MvpAdapter() {

    private val models by lazy {
        listOf<Model>()
    }

    override fun getItemCount(): Int {
        return models.size
    }

    override fun getItemViewType(position: Int): Int {
        return models[position].viewType
    }

    override fun onCreateViewGroupPresenter(parent: ViewGroup?, viewType: Int): ModelViewGroupPresenter? {
        return PresenterFactory.createViewGroupPresenter(parent, viewType)
    }
}