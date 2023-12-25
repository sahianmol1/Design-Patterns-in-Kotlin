package creational.singleton

fun main() {
    val chocoBoiler = ChocolateBoiler.getInstance()

    chocoBoiler?.fill()
    chocoBoiler?.boil()

    val chocoBoiler2 = ChocolateBoiler.getInstance()

    chocoBoiler2?.drain()
}