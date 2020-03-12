package com.exampler.duck

import android.util.Log

class MuteQuack :QuackBehavior{

    override fun quack() {
        Log.d(TAG,"<< Silence >>")
    }


}