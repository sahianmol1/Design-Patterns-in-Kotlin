package creational.factory.simplefactory.pizzafactory

import creational.factory.PizzaType
import creational.factory.simplefactory.pizza.CheesePizza
import creational.factory.simplefactory.pizza.ChickenPizza
import creational.factory.simplefactory.pizza.Pizza
import creational.factory.simplefactory.pizza.VeggiePizza

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