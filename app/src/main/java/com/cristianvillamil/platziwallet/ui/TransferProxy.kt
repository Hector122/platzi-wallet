package com.cristianvillamil.platziwallet.ui

import java.time.temporal.TemporalAmount

class TransferProxy {
    val MAX_TRANSFER_AMOUNT = 1000
    val MIN_TRANSFER_AMOUNT = 100

    fun checkTransfer(amount: Double): String {
        return when {
            amount > MAX_TRANSFER_AMOUNT -> " la trasaccion excede el maximo"
            amount < MIN_TRANSFER_AMOUNT -> "la transaccion debe ser mayor a $MIN_TRANSFER_AMOUNT "
            else -> {
                doTransfer(amount)
                "Transaccion exitosa"
            }
        }
    }

    private fun doTransfer(amount: Double){
    }
}