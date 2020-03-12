package com.exampler.duck

import android.util.Log
import android.widget.TextView

class RedheadDuck:Duck() {

    fun redheadDuck() {
        quackBehavior = Quack()
        flyBehavior = FlyRocketPowered()
    }

    override fun display(view: TextView) {
        view.text ="I’m a real Redhead duck"
    }
}