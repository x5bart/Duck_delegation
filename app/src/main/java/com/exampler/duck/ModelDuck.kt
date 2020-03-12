package com.exampler.duck

import android.util.Log
import android.widget.TextView

class ModelDuck:Duck() {

    fun ModelDuck() {
        flyBehavior = FlyNoWay()
        quackBehavior =  Quack()
    }
    override fun display(view:TextView) {
        view.text ="I’m a model duck"
    }
}