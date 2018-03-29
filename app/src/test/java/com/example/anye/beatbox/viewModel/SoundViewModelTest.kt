package com.example.anye.beatbox.viewModel

import com.example.anye.beatbox.BeatBox
import com.example.anye.beatbox.data.Sound
import org.hamcrest.core.Is
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test
import org.mockito.ArgumentMatchers
import org.mockito.Mockito.*

class SoundViewModelTest {

   private var mBeatBox:BeatBox?=null
    private val mSound:Sound= Sound("assetPath")
    private var mSubject:SoundViewModel?=null

    @Before
    fun setUp() {
        mBeatBox= mock(BeatBox::class.java)
        mSubject=SoundViewModel(mBeatBox!!)
        mSubject!!.mSound=mSound
    }

    @Test
    fun exposesSoundNameAsTitle(){
        assertThat(mSubject!!.getTitle(),Is.`is`(mSound.mName))
    }

    @Test
fun callsBeatBoxPlayOnButtonClicked(){
        mSubject!!.onButtonClicked()
        verify(mBeatBox)!!.play(mSound)
    }
}