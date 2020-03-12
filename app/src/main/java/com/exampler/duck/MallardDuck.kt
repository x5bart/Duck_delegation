package com.exampler.duck

import android.util.Log

class MallardDuck : Duck() {

    fun MallardDuck() {
        quackBehavior = Quack()
        flyBehavior = FlyWithWings()
    }

    override fun display() {
        Log.d(TAG, "I’m a real Mallard duck")
    }

}