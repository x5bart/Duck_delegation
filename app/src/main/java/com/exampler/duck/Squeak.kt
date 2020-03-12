package com.exampler.duck

import android.util.Log

class Squeak : QuackBehavior {
    override fun quack() {
        Log.d(TAG,"Squeak")
    }
}