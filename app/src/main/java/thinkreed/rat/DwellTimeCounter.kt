package thinkreed.rat

/**
 * Created by thinkreed on 2017/9/26.
 */
class DwellTimeCounter {

    private var dwellTime = 0L
    var state = State.NOT_ARRIVED
    private var startTime = System.currentTimeMillis()

    fun startDwell() {
        if (state == State.NOT_ARRIVED) {
            startTime = System.currentTimeMillis()
            state = State.DWELLING
        }
    }

    fun stopDwell() {
        if (state == State.DWELLING) {
            dwellTime = System.currentTimeMillis() - startTime
            state = State.LEFT
        }
    }

    fun getDwellTime(): Long {

        if (state == State.LEFT) {
            return dwellTime
        }

        return 0
    }

    enum class State {
        NOT_ARRIVED, DWELLING, LEFT
    }
}