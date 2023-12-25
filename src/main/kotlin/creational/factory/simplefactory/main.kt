package creational.factory.simplefactory

import creational.factory.PizzaType
import creational.factory.simplefactory.pizzastore.PizzaStore

fun main() {
    val pizzaStore = PizzaStore()
    pizzaStore.orderPizza(PizzaType.VEGGIE)
}