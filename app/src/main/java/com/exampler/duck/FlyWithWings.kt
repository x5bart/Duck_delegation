package com.exampler.duck

import android.util.Log

class FlyWithWings:FlyBehavior {

    override fun fly(){
        Log.d(TAG,"I’m flying!!")
    }
}