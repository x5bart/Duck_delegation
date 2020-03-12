package com.exampler.duck

import android.widget.TextView

class FlyRocketPowered:FlyBehavior {
    override fun fly(view: TextView) {
        view.text =" I’m flying with a rocket!"
    }
}