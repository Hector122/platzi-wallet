package com.cristianvillamil.platziwallet.ui.observers

interface Observable{
    fun addObservers(observer:Observer )
    fun removeObservers(observer:Observer )
    fun notifyObservers(newValue:Double )
}