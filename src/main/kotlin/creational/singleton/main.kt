package creational.singleton

fun main() {
//    val chocoBoiler = ChocolateBoiler.getInstance()
//
//    chocoBoiler?.fill()
//    chocoBoiler?.boil()
//
//    val chocoBoiler2 = ChocolateBoiler.getInstance()
//
//    chocoBoiler2?.drain()

    // Singleton with enum


    val chocoBoiler = ChocolateBoilerEnum.INSTANCE

    chocoBoiler.fill()
    chocoBoiler.boil()

    val chocoBoiler2 = ChocolateBoilerEnum.INSTANCE

    chocoBoiler2.drain()
}
