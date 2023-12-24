package creational.factory.simplefactory.pizzafactory

import creational.factory.simplefactory.pizza.CheesePizza
import creational.factory.simplefactory.pizza.ChickenPizza
import creational.factory.simplefactory.pizza.Pizza
import creational.factory.simplefactory.pizza.VeggiePizza
import creational.factory.simplefactory.pizzastore.PizzaType

class SimplePizzaFactory {

    fun createPizza(pizzaType: PizzaType): Pizza {
        return when(pizzaType){
            PizzaType.VEGGIE -> {
                VeggiePizza()
            }

            PizzaType.CHEESE -> {
                CheesePizza()
            }

            PizzaType.CHICKEN -> {
                ChickenPizza()
            }
        }
    }
}