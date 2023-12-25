package creational.factory.factory

import creational.factory.PizzaType
import creational.factory.factory.pizzastore.newyork.NewYorkStylePizzaStore

fun main() {
    val pizzaStore = NewYorkStylePizzaStore()
    pizzaStore.orderPizza(PizzaType.CHICKEN)

}