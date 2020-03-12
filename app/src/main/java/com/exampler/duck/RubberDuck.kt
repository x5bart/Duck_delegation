package com.exampler.duck


class RubberDuck:Duck() {

    fun rubberDuck(){
        quackBehavior = Squeak()
        flyBehavior = FlyNoWay()
    }
}