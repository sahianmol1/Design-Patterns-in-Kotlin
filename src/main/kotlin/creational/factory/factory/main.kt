package creational.factory.factory

import creational.factory.factory.pizza.nystyle.NewYorkVeggiePizza
import creational.factory.factory.pizzastore.chicago.ChicagoStylePizzaStore
import creational.factory.factory.pizzastore.newyork.NewYorkStylePizzaStore
import creational.factory.simplefactory.pizzastore.PizzaType

fun main() {
    val pizzaStore = NewYorkStylePizzaStore()
    pizzaStore.orderPizza(PizzaType.CHICKEN)

}