package com.example.anye.beatbox.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.anye.beatbox.R
import com.example.anye.beatbox.activity.base.SingleFragmentActivity
import com.example.anye.beatbox.fragment.BeatBoxFragment

class BeatBoxActivity : SingleFragmentActivity() {
    override fun createFragment(): Fragment {
        return BeatBoxFragment.newInstance()
    }

}
