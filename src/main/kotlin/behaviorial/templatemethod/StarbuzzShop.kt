package behaviorial.templatemethod

import behaviorial.templatemethod.caffeinebeverage.Coffee
import behaviorial.templatemethod.caffeinebeverage.Tea

fun main() {
    val coffee = Coffee()
    coffee.shouldAddCondiments = false
    coffee.prepare()

    println("-----------------------")

    val tea = Tea(shouldAddCondiments = false)
    tea.prepare()

}