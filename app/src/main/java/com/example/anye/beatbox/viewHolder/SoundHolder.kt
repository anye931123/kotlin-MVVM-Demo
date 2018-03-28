package com.example.anye.beatbox.viewHolder

import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.anye.beatbox.BeatBox
import com.example.anye.beatbox.data.Sound
import com.example.anye.beatbox.databinding.ListItemSoundBinding
import com.example.anye.beatbox.viewModel.SoundViewModel

/**
 * Created by anye on 2018/3/27.
 */
class SoundHolder(private val mBinding: ListItemSoundBinding,
                  private val mBeatBox: BeatBox,
                  itemView: View?=mBinding.root) : RecyclerView.ViewHolder(itemView) {

    init {
        mBinding.viewModel= SoundViewModel(mBeatBox)
    }

    fun bind(sound:Sound){
        mBinding.viewModel!!.mSound=sound
        mBinding.executePendingBindings()
    }

//    private var mBinding

}