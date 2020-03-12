package com.exampler.duck


class DecoyDuck:Duck() {


    fun decoyDuck(){
        quackBehavior = Quack()
        flyBehavior = FlyNoWay()
    }
}