package thinkreed.ratlist

/**
 * Created by thinkreed on 2017/9/28.
 */
abstract class ViewGroupPresenter : Presenter() {

    private val presenters = hashMapOf<Int, Presenter>()

    override fun <T> bind(model: T) {
        presenters.values.forEach { presenter ->
            presenter.bind(model)
        }
    }

    fun addPresenter(resId: Int, presenter: Presenter) = presenters.put(resId, presenter)

    fun removePresenterById(resId: Int) {
        if (presenters[resId] != null) {
            presenters.remove(resId)
        }
    }

    fun clearPresenters() = presenters.clear()
}