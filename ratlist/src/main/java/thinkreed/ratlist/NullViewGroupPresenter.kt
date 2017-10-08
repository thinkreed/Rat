package thinkreed.ratlist

import android.content.Context
import thinkreed.ratlist.mvp.ViewGroupPresenter

/**
 * Created by thinkreed on 2017/10/7.
 */
class NullViewGroupPresenter(layoutId:Int, context: Context): ViewGroupPresenter<Model>(layoutId, context) {
    override fun bind(model: Model) {
    }
}