package com.exampler.duck

import android.util.Log

class Quack : QuackBehavior {

    override fun quack() {
        Log.d(TAG, "Quack")
    }

}