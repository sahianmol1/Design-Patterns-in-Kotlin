package creational.factory.simplefactory

import creational.factory.simplefactory.pizzastore.PizzaStore
import creational.factory.simplefactory.pizzastore.PizzaType

fun main() {
    val pizzaStore = PizzaStore()
    pizzaStore.orderPizza(PizzaType.VEGGIE)
}