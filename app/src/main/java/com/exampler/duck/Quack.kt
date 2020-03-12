package com.exampler.duck

import android.widget.TextView

class Quack : QuackBehavior {


    override fun quack(view: TextView) {
        view.text = "Quack"
    }


}