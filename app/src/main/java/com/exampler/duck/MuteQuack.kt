package com.exampler.duck

import android.util.Log
import android.widget.TextView

class MuteQuack : QuackBehavior {

    override fun quack(view: TextView) {
        view.text = "<< Silence >>"
    }


}