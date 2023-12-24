package creational.factory.factory.pizzastore.newyork

import creational.factory.factory.pizza.Pizza
import creational.factory.factory.pizza.nystyle.NewYorkCheesePizza
import creational.factory.factory.pizza.nystyle.NewYorkChickenPizza
import creational.factory.factory.pizza.nystyle.NewYorkVeggiePizza
import creational.factory.factory.pizzastore.PizzaStore
import creational.factory.simplefactory.pizzastore.PizzaType


class NewYorkStylePizzaStore: PizzaStore() {
    override fun createPizza(pizzaType: PizzaType): Pizza {
        return when(pizzaType) {
            PizzaType.VEGGIE -> NewYorkVeggiePizza()
            PizzaType.CHEESE -> NewYorkCheesePizza()
            PizzaType.CHICKEN -> NewYorkChickenPizza()
        }
    }
}