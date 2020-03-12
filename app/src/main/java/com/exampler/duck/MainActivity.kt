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
            decoyDuck.display()
            decoyDuck.swim()
            decoyDuck.performQuack()
            decoyDuck.performFly()
        }
        btn_mallardDuck.setOnClickListener {
            val mallardDuck = MallardDuck()
            mallardDuck.MallardDuck()
            mallardDuck.display()
            mallardDuck.swim()
            mallardDuck.performQuack()
            mallardDuck.performFly()

            val model = ModelDuck()
            model.ModelDuck()
            model.performFly()
            model.flyBehavior = FlyRocketPowered()
            model.performFly()
        }
        btn_redHeadDuck.setOnClickListener {
            val redheadDuck = RedheadDuck()
            redheadDuck.redheadDuck()
            redheadDuck.display()
            redheadDuck.swim()
            redheadDuck.performFly()
            redheadDuck.performQuack()

        }
        btn_rubberDuck.setOnClickListener {
            val rubberDuck = RubberDuck()
            rubberDuck.rubberDuck()
            rubberDuck.display()
            rubberDuck.swim()
            rubberDuck.performFly()
            rubberDuck.performQuack()
        }
    }
}
