package com.exampler.duck

import android.widget.TextView

class FlyWithWings:FlyBehavior {

    override fun fly(view: TextView){
       view.text ="I’m flying!!"
    }
}