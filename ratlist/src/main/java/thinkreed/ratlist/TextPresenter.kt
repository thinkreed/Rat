package thinkreed.ratlist

import android.widget.TextView
import thinkreed.ratlist.mvp.Presenter

/**
 * Created by thinkreed on 2017/9/29.
 */
class TextPresenter : Presenter<Model>() {
    override fun bind(model: Model) {
        val textView = view as TextView
        textView.text = model.title
    }
}