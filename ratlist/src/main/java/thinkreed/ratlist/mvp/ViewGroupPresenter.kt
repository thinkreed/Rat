package thinkreed.ratlist.mvp

import android.view.ViewGroup

/**
 * Created by thinkreed on 2017/9/28.
 */
abstract class ViewGroupPresenter<T>(layoutId: Int, viewGroup: ViewGroup) : Presenter<T>() {

    private val presenters by lazy { hashMapOf<Int, Presenter<T>>() }

    override fun bind(model: T) {
        presenters.values.forEach { presenter ->
            presenter.render(model)
        }
    }

    fun addPresenter(resId: Int, presenter: Presenter<T>): ViewGroupPresenter<T> {
        presenter.bindView(resId, view.findViewById(resId))
        presenters.put(resId, presenter)
        return this
    }

    fun removePresenterById(resId: Int) {
        if (presenters[resId] != null) {
            presenters.remove(resId)
        }
    }

    fun clearPresenters() = presenters.clear()

    fun getCounts() = presenters.size
}