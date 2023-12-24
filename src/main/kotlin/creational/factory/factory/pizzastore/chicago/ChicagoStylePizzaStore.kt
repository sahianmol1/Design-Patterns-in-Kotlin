package creational.factory.factory.pizzastore.chicago

import creational.factory.factory.pizza.Pizza
import creational.factory.factory.pizzastore.PizzaStore
import creational.factory.factory.pizza.chicagostyle.ChicagoCheesePizza
import creational.factory.factory.pizza.chicagostyle.ChicagoChickenPizza
import creational.factory.factory.pizza.chicagostyle.ChicagoVeggiePizza
import creational.factory.simplefactory.pizzastore.PizzaType

class ChicagoStylePizzaStore: PizzaStore() {
    override fun createPizza(pizzaType: PizzaType): Pizza {
        return when(pizzaType) {
            PizzaType.VEGGIE -> ChicagoVeggiePizza()
            PizzaType.CHICKEN -> ChicagoChickenPizza()
            PizzaType.CHEESE -> ChicagoCheesePizza()
        }
    }
}