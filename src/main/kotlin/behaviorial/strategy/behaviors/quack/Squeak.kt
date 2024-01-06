package behaviorial.strategy.behaviors.quack

import behaviorial.strategy.behaviors.contract.QuackBehaviour

class Squeak: QuackBehaviour {
    override fun quack() {
        println("I Squeak!")
    }
}