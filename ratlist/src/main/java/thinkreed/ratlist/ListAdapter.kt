package thinkreed.ratlist

import android.view.ViewGroup

/**
 * Created by thinkreed on 2017/10/8.
 */
class ListAdapter : MvpAdapter() {

    private val models by lazy {
        mutableListOf<Model>()
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

    fun addItem(model: Model) {
        models.add(model)
    }

    fun removeItem(model: Model) {
        models.remove(model)
    }

    fun clear() {
        models.clear()
    }

    fun refreshItems(newModels: MutableList<Model>) {
        clear()
        models.addAll(newModels)
    }

    fun getItemByPosition(position: Int): Model {
        return models[position]
    }

    fun setItemAtPosition(position: Int, model: Model) {
        models[position] = model
    }
}