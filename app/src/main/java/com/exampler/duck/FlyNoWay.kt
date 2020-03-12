package com.exampler.duck

import android.widget.TextView

class FlyNoWay : FlyBehavior {

    override fun fly(view: TextView) {
        view.text = " I can’t fly"
    }
}