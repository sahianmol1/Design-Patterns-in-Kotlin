package behaviorial.templatemethod.caffeinebeverage

import behaviorial.templatemethod.caffeinebeverage.contract.CaffeineBeverage

class Coffee(
    var shouldAddCondiments: Boolean = true
): CaffeineBeverage() {
    override fun brew() {
        println("Dripping Coffee through filter")
    }

    override fun addCondiments() {
        println("Add Sugar and Milk")
    }

    override fun customerWantsCondiments() = shouldAddCondiments
}