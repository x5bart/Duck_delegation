package com.exampler.duck

import android.util.Log

abstract class Duck {
    lateinit var flyBehavior: FlyBehavior
    lateinit var quackBehavior: QuackBehavior

    fun swim() {
        Log.d(TAG, "All ducks float, even decoys!")
    }

    open fun display() {
        Log.d(TAG,"I'm static on display")
    }

    fun performQuack() {
        quackBehavior.quack()
    }

    fun performFly() {
        flyBehavior.fly()

    }

    fun setQuackBehevor(qb: QuackBehavior) {
        quackBehavior = qb
    }

    fun setFlyBehevior(fb: FlyBehavior) {
        flyBehavior = fb
    }
}