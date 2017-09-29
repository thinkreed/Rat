package thinkreed.ratlist

import android.content.Context
import android.view.LayoutInflater

/**
 * Created by thinkreed on 2017/9/28.
 */
abstract class ViewGroupPresenter<T>(layoutId: Int, context: Context) : Presenter<T>() {

    private val contentView by lazy {
        LayoutInflater.from(context).inflate(layoutId, null, false)
    }

    private val presenters by lazy { hashMapOf<Int, Presenter<T>>() }

    override fun bind(model: T) {
        presenters.values.forEach { presenter ->
            presenter.render(model)
        }
    }

    fun addPresenter(resId: Int, presenter: Presenter<T>): ViewGroupPresenter<T> {
        presenter.bindView(resId, contentView.findViewById(resId))
        presenters.put(resId, presenter)
        return this
    }

    fun removePresenterById(resId: Int) {
        if (presenters[resId] != null) {
            presenters.remove(resId)
        }
    }

    fun clearPresenters() = presenters.clear()
}