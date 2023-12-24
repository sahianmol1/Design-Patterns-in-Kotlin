package creational.factory.factory.pizza.chicagostyle

import creational.factory.factory.pizza.Pizza

class ChicagoChickenPizza: Pizza {

    private val chickenPizza = "Chicago style Chicken Pizza"

    override fun prepare() {
        println("$chickenPizza is being prepared...")
    }

    override fun bake() {
        println("$chickenPizza is being baked...")
    }

    override fun cut() {
        println("$chickenPizza is being cut...")
    }

    override fun box() {
        println("$chickenPizza is packed and ready to be delivered.")
    }
}