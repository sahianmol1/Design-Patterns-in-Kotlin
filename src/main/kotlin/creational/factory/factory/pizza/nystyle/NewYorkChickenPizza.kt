package creational.factory.factory.pizza.nystyle

import creational.factory.factory.pizza.Pizza

class NewYorkChickenPizza: Pizza {

    private val pizza = "NewYork Style Chicken Pizza"

    override fun prepare() {
        println("$pizza is being prepared...")
    }

    override fun bake() {
        println("$pizza is being baked...")
    }

    override fun cut() {
        println("$pizza is being cut...")
    }

    override fun box() {
        println("$pizza is packed and ready to be delivered.")
    }
}