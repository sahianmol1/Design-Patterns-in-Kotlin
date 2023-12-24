package creational.factory.factory.pizzastore

import creational.factory.factory.pizza.Pizza
import creational.factory.simplefactory.pizzastore.PizzaType

abstract class PizzaStore {
    fun orderPizza(pizzaType: PizzaType): Pizza {
        val pizza = createPizza(pizzaType)

        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza
    }

    protected abstract fun createPizza(pizzaType: PizzaType): Pizza
}