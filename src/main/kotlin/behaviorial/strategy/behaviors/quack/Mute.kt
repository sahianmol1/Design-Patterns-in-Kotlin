package behaviorial.strategy.behaviors.quack

import behaviorial.strategy.behaviors.contract.QuackBehaviour

class Mute: QuackBehaviour {
    override fun quack() {
        println("I'm mute!")
    }
}