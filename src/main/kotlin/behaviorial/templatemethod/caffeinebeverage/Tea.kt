package behaviorial.templatemethod.caffeinebeverage

import behaviorial.templatemethod.caffeinebeverage.contract.CaffeineBeverage

class Tea(
    private var shouldAddCondiments: Boolean = true
): CaffeineBeverage() {
    override fun brew() {
        println("Steeping the tea")
    }

    override fun addCondiments() {
        println("Adding Lemon")
    }

    override fun customerWantsCondiments() = shouldAddCondiments
}