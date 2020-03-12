package com.exampler.duck

import android.widget.TextView

class Squeak : QuackBehavior {
    override fun quack(view: TextView) {
        view.text ="Squeak"
    }
}