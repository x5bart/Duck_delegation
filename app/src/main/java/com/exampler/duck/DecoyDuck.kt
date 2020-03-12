package com.exampler.duck


class DecoyDuck:Duck() {


    fun decoyDuck(){
        quackBehavior = MuteQuack()
        flyBehavior = FlyNoWay()
    }
}