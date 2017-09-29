package thinkreed.ratlist

/**
 * Created by thinkreed on 2017/9/28.
 */
abstract class ViewGroupPresenter<in T> : Presenter<T>() {

    private val presenters = hashMapOf<Int, Presenter<T>>()

    override fun bind(model: T) {
        presenters.values.map { presenter ->
            presenter.bind(model)
        }
    }

    fun addPresenter(resId: Int, presenter: Presenter<T>) {
        presenters.put(resId, presenter)
    }

    fun removePresenterById(resId:Int) {
        if (presenters[resId] != null) {
            presenters.remove(resId)
        }
    }
}