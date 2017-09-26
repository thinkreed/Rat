package thinkreed.rat

import org.junit.Test

/**
 * Created by thinkreed on 2017/9/26.
 */
class DwellTimeCounterTest {

    private val dwellTimeCounter = DwellTimeCounter()

    @Test
    fun startDwell() {
        dwellTimeCounter.startDwell()

        assert(dwellTimeCounter.state == DwellTimeCounter.State.DWELLING)
    }

    @Test
    fun stopDwell() {
        dwellTimeCounter.stopDwell()

        assert(dwellTimeCounter.state == DwellTimeCounter.State.LEFT)
    }

    @Test
    fun getDwellTime() {
        assert(dwellTimeCounter.getDwellTime() != 0L)
    }

}