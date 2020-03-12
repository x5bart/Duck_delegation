package com.exampler.duck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

const val TAG = "Mylogs"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_decoyDuck.setOnClickListener {
            val decoyDuck= DecoyDuck()
            decoyDuck.decoyDuck()
            decoyDuck.display(tv_display)
            decoyDuck.swim(tv_swim)
            decoyDuck.performQuack(tv_quack)
            decoyDuck.performFly(tv_fly)
        }
        btn_mallardDuck.setOnClickListener {
            val mallardDuck = MallardDuck()
            mallardDuck.MallardDuck()
            mallardDuck.display(tv_display)
            mallardDuck.swim(tv_swim)
            mallardDuck.performQuack(tv_quack)
            mallardDuck.performFly(tv_fly)

            val model = ModelDuck()
            model.ModelDuck()
            model.performFly(tv_fly)
            model.flyBehavior = FlyRocketPowered()
            model.performFly(tv_fly)
        }
        btn_redHeadDuck.setOnClickListener {
            val redheadDuck = RedheadDuck()
            redheadDuck.redheadDuck()
            redheadDuck.display(tv_display)
            redheadDuck.swim(tv_swim)
            redheadDuck.performQuack(tv_quack)
            redheadDuck.performFly(tv_fly)

        }
        btn_rubberDuck.setOnClickListener {
            val rubberDuck = RubberDuck()
            rubberDuck.rubberDuck()
            rubberDuck.display(tv_display)
            rubberDuck.swim(tv_swim)
            rubberDuck.performQuack(tv_quack)
            rubberDuck.performFly(tv_fly)
        }
    }
}
