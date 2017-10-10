package thinkreed.ratlist

import android.view.LayoutInflater
import android.view.ViewGroup
import thinkreed.ratlist.mvp.ViewGroupPresenter

/**
 * Created by thinkreed on 2017/10/10.
 */
abstract class ModelViewGroupPresenter(layoutId:Int, viewGroup: ViewGroup):ViewGroupPresenter<Model>(layoutId, viewGroup) {
    init {
        bindView(layoutId, LayoutInflater.from(viewGroup.context).inflate(layoutId, viewGroup, false))
    }
}