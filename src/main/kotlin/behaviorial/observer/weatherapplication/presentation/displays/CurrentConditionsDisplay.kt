package behaviorial.observer.weatherapplication.presentation.displays

import behaviorial.observer.observer.Observer
import behaviorial.observer.weatherapplication.data.WeatherData
import behaviorial.observer.weatherapplication.presentation.displays.contract.DisplayElement

class CurrentConditionsDisplay(
    private val weatherData: WeatherData
) : Observer, DisplayElement {

    private var temperature: Float = 0.0F
    private var humidity: Float = 0.0F

    init {
        weatherData.addObserver(this)
    }

    override fun update() {
        temperature = weatherData.temperature
        humidity = weatherData.humidity
        display()
    }

    override fun display() {
        println(
            "Current conditions: ${temperature}F temperature and ${humidity}% humidity."
        )
    }
}