package thinkreed.ratlist

/**
 * Created by thinkreed on 2017/9/28.
 */
abstract class Presenter<in T> {

    abstract fun bind(model:T)
}