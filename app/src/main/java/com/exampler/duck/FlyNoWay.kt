package com.exampler.duck

import android.util.Log

class FlyNoWay : FlyBehavior {

    override fun fly() {
        Log.d(TAG, "I can’t fly")
    }
}