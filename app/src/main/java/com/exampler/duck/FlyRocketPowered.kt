package com.exampler.duck

import android.util.Log

class FlyRocketPowered:FlyBehavior {
    override fun fly() {
        Log.d(TAG,"I’m flying with a rocket!")
    }
}