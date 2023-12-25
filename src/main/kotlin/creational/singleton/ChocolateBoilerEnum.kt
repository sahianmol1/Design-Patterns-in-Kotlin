package creational.singleton

enum class ChocolateBoilerEnum(
    private var empty: Boolean = true,
    private var boiled: Boolean = false
) {
    INSTANCE;

    fun fill() {
        if (isEmpty()) {
            empty = false
            boiled = false
            println("Fill the boiler with milk and chocolate")
        }
    }

    fun drain() {
        if (!isEmpty() && isBoiled()) {
            println("Drain the boiled chocolate")
            empty = true
        }
    }

    fun boil() {
        if (!isEmpty() && !isBoiled()) {
            println("Bring the Contents to boil")
            boiled = true
        }
    }

    private fun isEmpty() = empty

    private fun isBoiled() = boiled
}