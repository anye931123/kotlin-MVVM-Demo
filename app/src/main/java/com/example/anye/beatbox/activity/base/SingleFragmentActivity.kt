package com.example.anye.beatbox.activity.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.example.anye.beatbox.R

/**
 * Created by anye on 2018/3/27.
 */
abstract class SingleFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())
        var fragment = supportFragmentManager.findFragmentById(R.id.fragment_container)

        if (fragment == null) {
            fragment = createFragment()
            supportFragmentManager.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit()

        }

    }

    abstract fun createFragment(): Fragment
    @LayoutRes
    protected open fun getLayoutResId(): Int {

        return R.layout.activity_beat_box

    }

}