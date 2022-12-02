package com.cristianvillamil.platziwallet.ui.home.data

import android.content.Context
import androidx.appcompat.app.AlertDialog

class MessageFactory {
    companion object {
        val TYPE_ERROR = "typeError"
        val TYPE_SUCCESS = "typeSuccess"
        val TYPE_INFO = "typeInfo"
    }

    fun getAlertDialog(context: Context, type: String): AlertDialog.Builder {
        return when (type) {
            TYPE_ERROR -> AlertDialog.Builder(context)
                .setMessage("Hay un error con el contenido")
            TYPE_SUCCESS -> AlertDialog.Builder(context)
                .setMessage("El Contenido fue cargado exitosamente")
            TYPE_INFO -> AlertDialog.Builder(context)
                .setMessage("El Contenido fue cargado exitosamente")
            else -> AlertDialog.Builder(context).setMessage("no sabemos lo que paso, agrega nuevo typo")
        }
    }

}