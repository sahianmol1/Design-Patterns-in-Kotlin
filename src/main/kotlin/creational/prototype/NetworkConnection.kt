package creational.prototype

class NetworkConnection(
    val ip: String = "192.168.0.1",
    val baseUrl: String = "https://www.baseurl.com/"
) : Cloneable {

    @Volatile
    var isReadyToConnect: Boolean = false

    init {
        println("trying to connect to network...")
        isReadyToConnect = false
        Thread.sleep(5000)
        isReadyToConnect = true
    }

    fun connect() {
        if (isReadyToConnect) {
            println("Network Established!")
        } else {
            println("Network is not available")
        }
    }

    public override fun clone(): NetworkConnection {
        return this
    }
}