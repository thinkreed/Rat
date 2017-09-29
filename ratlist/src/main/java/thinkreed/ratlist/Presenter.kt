package thinkreed.ratlist

import android.view.View

/**
 * Created by thinkreed on 2017/9/28.
 */
abstract class Presenter<in T> {

    lateinit var view: View

    var id = 0

    private var state = State.UNINITIALIZED

    fun bindView(id: Int, view: View) {
        this.id = id
        this.view = view
        state = State.INITIALIZED
    }

    fun render(model: T) {

        if (state == State.UNINITIALIZED) {
            return
        }

        bind(model)

        state = State.RENDERED
    }

    abstract protected fun bind(model: T)

    private enum class State {
        UNINITIALIZED, INITIALIZED, RENDERED
    }
}