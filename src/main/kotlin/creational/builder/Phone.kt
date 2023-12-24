package creational.builder

class Phone private constructor(
    private val os: String? = null,
    private val screenSize: Float? = null,
    private val ram: Int? = null,
    private val storage: Int? = null,
    private val processor: String? = null
) {

    fun getPhoneDetails() = buildString {
        this.append("You have selected these specifications for your phone \n")

        os?.let {
            this.append("OS Selected: $it \n")
        }

        screenSize?.let {
            this.append("screenSize Selected: $screenSize \n")
        }

        ram?.let {
            this.append("ram Selected: ${ram}GB \n")
        }

        storage?.let {
            this.append("storage Selected: ${storage}GB \n")
        }

        processor?.let {
            this.append("processor Selected: $processor \n")
        }
    }

    class Builder {
        private var os: String? = null
        private var screenSize: Float? = null
        private var ram: Int? = null
        private var storage: Int? = null
        private var processor: String? = null

        fun setOs(os: String): Builder {
            this.os = os
            return this
        }

        fun setScreenSize(screenSize: Float): Builder {
            this.screenSize = screenSize
            return this
        }

        fun setRam(ram: Int): Builder {
            this.ram = ram
            return this
        }

        fun setStorage(storage: Int): Builder {
            this.storage = storage
            return this
        }

        fun setProcessor(processor: String): Builder {
            this.processor = processor
            return this
        }

        fun build(): Phone {
            return Phone(
                os = os,
                screenSize = screenSize,
                ram = ram,
                storage = storage,
                processor = processor
            )
        }
    }
}
