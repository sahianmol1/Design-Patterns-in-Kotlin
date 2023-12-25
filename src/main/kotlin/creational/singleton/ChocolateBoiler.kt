package creational.singleton

class ChocolateBoiler private constructor(
    private var empty: Boolean = true,
    private var boiled: Boolean = false
) {

    companion object {

        @Volatile
        private var instance: ChocolateBoiler? = null

        fun getInstance(): ChocolateBoiler? {
            return instance ?: synchronized(this){
                instance = ChocolateBoiler()
                instance
            }
        }
    }

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

    fun boil(){
        if (!isEmpty() && !isBoiled()) {
            println("Bring the Contents to boil")
            boiled = true
        }
    }

    private fun isEmpty() = empty

    private fun isBoiled() = boiled
}