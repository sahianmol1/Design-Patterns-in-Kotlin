package behaviorial.strategy.behaviors.fly

import behaviorial.strategy.behaviors.contract.FlyBehavior

class FlyWithWings: FlyBehavior {
    override fun fly() {
        println("I'm flying!")
    }
}