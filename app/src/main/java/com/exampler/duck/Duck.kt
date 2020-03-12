package com.exampler.duck

import android.util.Log
import android.widget.TextView

abstract class Duck {
    lateinit var flyBehavior: FlyBehavior
    lateinit var quackBehavior: QuackBehavior

    fun swim(view: TextView) {
        view.text ="All ducks float, even decoys!"
    }

    open fun display(view: TextView) {
        view.text ="I'm static on display"
    }

    fun performQuack(view: TextView) {
        quackBehavior.quack(view)
    }

    fun performFly(view: TextView) {
        flyBehavior.fly(view)

    }

    fun setQuackBehevor(qb: QuackBehavior) {
        quackBehavior = qb
    }

    fun setFlyBehevior(fb: FlyBehavior) {
        flyBehavior = fb
    }
}