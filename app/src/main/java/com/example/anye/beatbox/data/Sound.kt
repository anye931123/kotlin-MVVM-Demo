package com.example.anye.beatbox.data

/**
 * Created by anye on 2018/3/27.
 */
data class  Sound( val mAssetPath:String){
     var mName:String
    var mSoundId:Int? = null

    init {
        var components=mAssetPath.split("/")
        var filename=components[components.size-1]
        mName=filename.replace(".wav","")
    }

}