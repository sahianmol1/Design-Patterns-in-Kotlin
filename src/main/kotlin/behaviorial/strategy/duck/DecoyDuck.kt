package behaviorial.strategy.duck

import behaviorial.strategy.behaviors.contract.FlyBehavior
import behaviorial.strategy.behaviors.fly.FlyNoWings
import behaviorial.strategy.behaviors.quack.Mute

class DecoyDuck: Duck(
    flyBehavior = FlyNoWings(),
    quackBehaviour = Mute()
) {
    override fun display() {
        println("I'm a Decoy!!")
    }

    fun setFlyBehaviour(fb: FlyBehavior) {
        flyBehavior = fb
    }
}