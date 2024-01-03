package behaviorial.observer.weatherapplication.data

import behaviorial.observer.observer.Observer
import behaviorial.observer.subject.Subject

class WeatherData : Subject {

    var temperature: Float = 0.0F
        private set
    var humidity: Float = 0.0F
        private set
    var pressure: Float = 0.0F
        private set

    private var observers: MutableList<Observer> = mutableListOf()

    private fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(
        temperature: Float,
        humidity: Float,
        pressure: Float,
    ) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure

        measurementsChanged()
    }

    override fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach {
            it.update()
        }
    }
}