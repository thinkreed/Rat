package thinkreed.rat

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by thinkreed on 2017/9/27.
 */
class FrameFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_frame, container, false)
    }

    companion object {
        val INSTANCE = FrameFragment()
    }
}