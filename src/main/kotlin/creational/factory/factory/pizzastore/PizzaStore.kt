package creational.factory.factory.pizzastore

import creational.factory.PizzaType
import creational.factory.factory.pizza.Pizza

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