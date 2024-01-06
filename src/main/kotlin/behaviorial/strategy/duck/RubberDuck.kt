package behaviorial.strategy.duck

import behaviorial.strategy.behaviors.fly.FlyNoWings
import behaviorial.strategy.behaviors.quack.Squeak

class RubberDuck: Duck(
    flyBehavior = FlyNoWings(),
    quackBehaviour = Squeak()
) {
    override fun display() {
        println("I'm a rubber duckie!!!")
    }
}