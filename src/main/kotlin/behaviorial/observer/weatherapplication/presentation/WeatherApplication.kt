package behaviorial.observer.weatherapplication.presentation

import behaviorial.observer.weatherapplication.data.WeatherData
import behaviorial.observer.weatherapplication.presentation.displays.CurrentConditionsDisplay
import behaviorial.observer.weatherapplication.presentation.displays.ForecastDisplay
import behaviorial.observer.weatherapplication.presentation.displays.StatisticsDisplay

fun main() {
    val weatherData = WeatherData()
    val currentConditionsDisplay = CurrentConditionsDisplay(weatherData)
    val forecastDisplay = ForecastDisplay(weatherData)
    val statisticsDisplay = StatisticsDisplay(weatherData)

    weatherData.setMeasurements(80.0F, 65.0F, 30.4F)
    weatherData.setMeasurements(82.0F, 70.0F, 29.2F)
    weatherData.setMeasurements(78.0F, 90.0F, 29.2F)
}