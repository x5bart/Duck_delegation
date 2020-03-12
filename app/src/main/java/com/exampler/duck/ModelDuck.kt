package com.exampler.duck

import android.util.Log

class ModelDuck:Duck() {

    fun ModelDuck() {
        flyBehavior = FlyNoWay()
        quackBehavior =  Quack()
    }
    override fun display() {
   Log.d(TAG,"I’m a model duck")
    }
}