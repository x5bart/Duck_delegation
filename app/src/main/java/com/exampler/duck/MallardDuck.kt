package com.exampler.duck

import android.util.Log
import android.widget.TextView

class MallardDuck : Duck() {

    fun MallardDuck() {
        quackBehavior = Quack()
        flyBehavior = FlyWithWings()
    }

    override fun display(view: TextView) {
        view.text ="I’m a real Mallard duck"
    }

}