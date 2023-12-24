package creational.factory.simplefactory.pizza

class VeggiePizza : Pizza {

    private val veggiePizza = "Veggie Pizza"

    override fun prepare() {
        println("$veggiePizza is being prepared...")
    }

    override fun bake() {
        println("$veggiePizza is being baked...")

    }

    override fun cut() {
        println("$veggiePizza is being cut...")

    }

    override fun box() {
        println("$veggiePizza is packed and ready to be delivered.")

    }
}