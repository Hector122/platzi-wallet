package com.cristianvillamil.platziwallet.ui.observers

import java.time.temporal.TemporalAmount

class AvailableBalanceObservable :Observable{
    private val amountObservable: ArrayList<Observer> = arrayListOf()
    private var amount: Double = 0.0

    fun changeAmount(newAmount: Double){
        amount = newAmount
        notifyObservers(amount)
    }

    override fun addObservers(observer: Observer) {
        amountObservable.add(observer)
    }

    override fun removeObservers(observer: Observer) {
        amountObservable.remove(observer)
    }

    override fun notifyObservers(newValue: Double) {
       amountObservable.forEach {
           it.notifyChange(newValue)
       }
    }
}