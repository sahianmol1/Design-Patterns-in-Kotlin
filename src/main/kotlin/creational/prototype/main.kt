package creational.prototype

fun main() {
    val nc = NetworkConnection()

    nc.connect()

    val nc2 = nc.clone()


    println(nc2.ip)

}