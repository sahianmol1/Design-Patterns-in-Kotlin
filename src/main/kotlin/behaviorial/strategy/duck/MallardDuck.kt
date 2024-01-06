package behaviorial.strategy.duck

import behaviorial.strategy.behaviors.fly.FlyWithWings
import behaviorial.strategy.behaviors.quack.Quack

class MallardDuck: Duck(
    flyBehavior = FlyWithWings(),
    quackBehaviour = Quack()
) {
    override fun display() {
        println("I'm a mallard duck!")
    }
}