package com.exampler.duck

import android.util.Log

class RedheadDuck:Duck() {

    fun redheadDuck() {
        quackBehavior = Quack()
        flyBehavior = FlyRocketPowered()
    }

    override fun display() {
        Log.d(TAG, "I’m a real Redhead duck")
    }
}