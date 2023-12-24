package creational.builder

fun main() {
    val phone: Phone = Phone.Builder()
        .setOs("Android")
        .setProcessor("MediaTek")
        .build()

    println(phone)

    println(phone.getPhoneDetails())
}