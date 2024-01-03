package behaviorial.observer.weatherapplication.presentation.displays

import behaviorial.observer.observer.Observer
import behaviorial.observer.weatherapplication.data.WeatherData
import behaviorial.observer.weatherapplication.presentation.displays.contract.DisplayElement

class ForecastDisplay(
    private val weatherData: WeatherData
): Observer, DisplayElement {

    private var currentPressure: Float = 0.0F
    private var lastPressure: Float = 0.0F
    private var pressure: Float = 0.0F

    init {
        weatherData.addObserver(this)
    }
    override fun update() {
        lastPressure = currentPressure
        currentPressure = weatherData.pressure
        display()
    }

    override fun display() {
        System.out.print("Forecast: ")
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!")
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same")
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather")
        }
    }
}