package behaviorial.observer.subject

import behaviorial.observer.observer.Observer

interface Subject {

    fun addObserver(observer: Observer)

    fun removeObserver(observer: Observer)

    fun notifyObservers()
}