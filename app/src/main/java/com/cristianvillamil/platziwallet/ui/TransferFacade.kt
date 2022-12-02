package com.cristianvillamil.platziwallet.ui

class TransferFacade {
    private val analitysManager = AnalitysManager()
    private val segurityManager = SegurityManager()
    private val transferManager = TransferManager()

    fun transfer(amount: Double){
        val token = segurityManager.getToken()
        analitysManager.registerTransfer(token, amount)
        transferManager.transfer(token, amount)
    }
}