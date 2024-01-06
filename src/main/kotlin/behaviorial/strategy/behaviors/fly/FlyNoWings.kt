package behaviorial.strategy.behaviors.fly

import behaviorial.strategy.behaviors.contract.FlyBehavior

class FlyNoWings: FlyBehavior {
    override fun fly() {
        println("I can't fly!")
    }
}