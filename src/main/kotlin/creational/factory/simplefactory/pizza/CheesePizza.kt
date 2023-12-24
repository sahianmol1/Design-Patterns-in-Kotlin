package creational.factory.simplefactory.pizza

class CheesePizza : Pizza {
    private val pepperoniPizza = "Chhese Pizza"

    override fun prepare() {
        println("$pepperoniPizza is being prepared...")
    }

    override fun bake() {
        println("$pepperoniPizza is being baked...")

    }
    override fun cut() {
        println("$pepperoniPizza is being cut...")

    }

    override fun box() {
        println("$pepperoniPizza is packed and ready to be delivered.")

    }
}