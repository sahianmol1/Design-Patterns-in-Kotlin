package behaviorial.strategy.app

import behaviorial.strategy.behaviors.fly.FlyWithWings
import behaviorial.strategy.duck.DecoyDuck
import behaviorial.strategy.duck.MallardDuck
import behaviorial.strategy.duck.RubberDuck

fun main() {
    val rubberDuck = RubberDuck()
    rubberDuck.display()
    rubberDuck.performFly()
    rubberDuck.swim()
    rubberDuck.performQuack()

    println("-------------------------------------")

    val mallardDuck = MallardDuck()
    mallardDuck.display()
    mallardDuck.performFly()
    mallardDuck.swim()
    mallardDuck.performQuack()

    println("-------------------------------------")

    val decoyDuck = DecoyDuck()
    decoyDuck.display()
    decoyDuck.performFly()
    decoyDuck.swim()
    decoyDuck.performQuack()

    decoyDuck.setFlyBehaviour(fb = FlyWithWings())
    decoyDuck.performFly()

}