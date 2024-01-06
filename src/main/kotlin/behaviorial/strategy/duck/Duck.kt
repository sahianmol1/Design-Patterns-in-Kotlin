package behaviorial.strategy.duck

import behaviorial.strategy.behaviors.contract.FlyBehavior
import behaviorial.strategy.behaviors.contract.QuackBehaviour

abstract class Duck(
    var flyBehavior: FlyBehavior,
    var quackBehaviour: QuackBehaviour
) {
    abstract fun display()

    fun performFly(){
        flyBehavior.fly()
    }

    fun performQuack() {
        quackBehaviour.quack()
    }

    fun swim() {
        println("I Swim!")
    }

}