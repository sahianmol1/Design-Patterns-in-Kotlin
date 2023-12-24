package creational.factory.simplefactory.pizzastore

import creational.factory.simplefactory.pizza.Pizza
import creational.factory.simplefactory.pizzafactory.SimplePizzaFactory

class PizzaStore(private val pizzaFactory: SimplePizzaFactory = SimplePizzaFactory()) {

    fun orderPizza(pizzaType: PizzaType): Pizza {

        val pizza = pizzaFactory.createPizza(pizzaType)

        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza
    }
}

enum class PizzaType {
    VEGGIE, CHICKEN, CHEESE
}