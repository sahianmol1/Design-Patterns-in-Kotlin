package creational.builder

class User private constructor(
    val firstName: String?,
    val middleName: String?, // optional
    val lastName: String?,
    val address: String?,
    val contact: String?, // optional
    val company: String?
)  {

    class Builder {
        var firstName: String? = null
        var middleName: String? = null // optional
        var lastName: String? = null
        var address: String? = null
        var contact: String? = null // optional
        var company: String? = null // optional

        fun setFirstName(firstName: String): Builder {
            this.firstName = firstName
            return this
        }

        // OR

        fun setMiddleName(middleName: String) = apply {
            this.middleName = middleName
        }

        fun setLastName(lastName: String) = apply {
            this.lastName = lastName
        }

        fun setAddress(address: String) = apply {
            this.address = address
        }

        fun setContact(contact: String) = apply {
            this.contact = contact
        }

        fun setCompany(company: String) = apply {
            this.company = company
        }

        fun build(): User {
            return User(
                firstName,
                middleName,
                lastName,
                address,
                contact,
                company,
            )
        }
    }
}

fun main() {

    val user = User.Builder()
        .setFirstName("Abhishek")
        .setLastName("Saxena")
        .setContact("9041274648")
        .build() // <- user object is built here


    println(user.firstName)
}