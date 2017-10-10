package thinkreed.ratlist

import android.view.ViewGroup

/**
 * Created by thinkreed on 2017/9/29.
 */
object PresenterFactory {

    fun createTextPresenter(): TextPresenter = TextPresenter()

    fun createViewGroupPresenter(parent: ViewGroup?, viewType: Int): ModelViewGroupPresenter? {

        if (parent == null) {
            return null
        }

        return when (viewType) {
            else -> ListPresenter(R.layout.item_list, parent)
        }
    }
}