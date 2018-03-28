package com.example.anye.beatbox.adapter

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.anye.beatbox.BeatBox
import com.example.anye.beatbox.R
import com.example.anye.beatbox.databinding.ListItemSoundBinding
import com.example.anye.beatbox.viewHolder.SoundHolder

/**
 * Created by anye on 2018/3/27.
 */
class SoundAdapter(private val context: Context,
                   private val mBeatBox: BeatBox):
        RecyclerView.Adapter<SoundHolder>() {


    private val mSounds= mBeatBox.mSounds

    override fun getItemCount(): Int {

        return mSounds.size

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): SoundHolder {

        val inflater=LayoutInflater.from(context)
        val binding=DataBindingUtil.inflate<ListItemSoundBinding>(inflater,
                R.layout.list_item_sound,parent,false)
        return SoundHolder(binding,mBeatBox)
    }

    override fun onBindViewHolder(holder: SoundHolder?, position: Int) {

        holder!!.bind(mSounds[position])
    }


}