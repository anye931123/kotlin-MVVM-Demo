package com.example.anye.beatbox.viewModel

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.example.anye.beatbox.BeatBox
import com.example.anye.beatbox.data.Sound

class SoundViewModel(private val mBeatBox:BeatBox):BaseObservable() {
    var mSound:Sound?=null
    set(value){
        field=value
        notifyChange()
    }

    @Bindable
    fun getTitle():String=mSound!!.mName
}