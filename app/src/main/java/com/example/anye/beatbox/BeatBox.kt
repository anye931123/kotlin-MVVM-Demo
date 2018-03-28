package com.example.anye.beatbox

import android.content.Context
import android.content.res.AssetManager
import android.media.AudioManager
import android.media.SoundPool
import android.util.Log
import com.example.anye.beatbox.data.Sound
import java.io.IOException

/**
 * Created by anye on 2018/3/27.
 */
class BeatBox(context: Context,
              private val mAssets: AssetManager = context.assets) {

    val mSounds= mutableListOf<Sound>()
    val mSoundPool=SoundPool(MAX_SOUNDS,AudioManager.STREAM_MUSIC,0)
    init {
        loadSounds()


    }

    companion object {
        private const val TAG = "BeatBox"
        private const val SOUNDS_FOLDER = "sample_sounds"
        private const val MAX_SOUNDS=5

    }


    private fun loadSounds() {
        var soundNames: Array<String>
        try {
            soundNames = mAssets.list(SOUNDS_FOLDER)
            Log.i(TAG, "Found${soundNames.size}sounds")
        } catch (ioe: IOException) {
            Log.e(TAG, "could not list assets", ioe)
            return
        }
        for (soundName in soundNames){
            var assetPath= "$SOUNDS_FOLDER/$soundName"
          val  sound= Sound(assetPath)
            load(sound)
            mSounds.add(sound)
        }
    }

    private fun load(sound: Sound) {
        val afd=mAssets.openFd(sound.mAssetPath)
        val soundId=mSoundPool.load(afd,1)
        sound.mSoundId=soundId
    }

    fun play(sound: Sound){
        val soundId= sound.mSoundId?: return
        mSoundPool.play(soundId,1.0f,1.0f,1,0,1.0f)
    }
}

