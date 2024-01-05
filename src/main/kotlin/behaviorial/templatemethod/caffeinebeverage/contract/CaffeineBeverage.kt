package behaviorial.templatemethod.caffeinebeverage.contract

abstract class CaffeineBeverage {

    /**
     * This is called a template method.
     *
     * A template methods lets us encapsulate an algorithm by defining the skeleton of an algorithm
     * in a method and deferring some steps to subclasses.
     *
     * Template method lets subclasses define certain steps of an algorithm without changing the algorithm's structure
     */
    fun prepare() {
        boilWater()

        brew()

        pourIntoCup()

        if (customerWantsCondiments()) {
            addCondiments()
        }
    }

    private fun boilWater() {
        println("Boiling the water")
    }

    private fun pourIntoCup() {
        println("Pouring into cup")
    }

    abstract fun brew()

    abstract fun addCondiments()

    /**
     * This is called the hook method.
     * This is defined in the abstract super class and base classes can modify its behaviour.
     * This gives the subclasses ability to "hook into" the algorithm at various points
     */
    open fun customerWantsCondiments() = true

}