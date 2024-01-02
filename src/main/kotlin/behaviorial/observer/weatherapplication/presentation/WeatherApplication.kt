package behaviorial.observer.weatherapplication.presentation

import behaviorial.observer.weatherapplication.data.WeatherData
import behaviorial.observer.weatherapplication.presentation.displays.CurrentConditionsDisplay

fun main() {
    val weatherData = WeatherData()
    val currentConditionsDisplay = CurrentConditionsDisplay(weatherData)

    weatherData.setMeasurements(
        temperature = 98.0F, humidity = 56.0F, pressure = 6.7F
    )

    weatherData.setMeasurements(
        temperature = 60.0F, humidity = 58.0F, pressure = .7F
    )

    weatherData.setMeasurements(
        temperature = 34.0F, humidity = 78.0F, pressure = 6.43F
    )
}