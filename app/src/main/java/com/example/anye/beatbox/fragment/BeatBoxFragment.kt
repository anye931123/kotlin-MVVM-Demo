package com.example.anye.beatbox.fragment

import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.TextView
import com.example.anye.beatbox.BeatBox

import com.example.anye.beatbox.R
import com.example.anye.beatbox.adapter.SoundAdapter
import com.example.anye.beatbox.databinding.FragmentBeatBoxBinding


class BeatBoxFragment : Fragment() {


    private lateinit var mBeatBox:BeatBox
companion object {
    fun newInstance():BeatBoxFragment{

        return BeatBoxFragment()
    }
}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBeatBox=BeatBox(activity)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding=DataBindingUtil.inflate<FragmentBeatBoxBinding>(inflater,
                R.layout.fragment_beat_box,
                container,
                false)

        binding.recycleView.layoutManager= GridLayoutManager(activity,3)
        binding.recycleView.adapter=SoundAdapter(activity,mBeatBox)
        return binding.root
    }
}