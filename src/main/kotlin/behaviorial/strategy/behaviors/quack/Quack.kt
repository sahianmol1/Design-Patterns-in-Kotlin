package behaviorial.strategy.behaviors.quack

import behaviorial.strategy.behaviors.contract.QuackBehaviour

class Quack: QuackBehaviour {
    override fun quack() {
        println("I quack")
    }
}