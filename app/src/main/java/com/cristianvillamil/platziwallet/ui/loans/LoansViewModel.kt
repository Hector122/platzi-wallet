package com.cristianvillamil.platziwallet.ui.loans

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoansViewModel : ViewModel() {
    private val _percentageLiveData = MutableLiveData<String>()
    val percentageLiveData: LiveData<String> get() = _percentageLiveData

    private val _loansListLiveData = MutableLiveData<List<Loan>>()
    val loansListLiveData: LiveData<List<Loan>> get() = _loansListLiveData

    fun changeValues() {
        _percentageLiveData.value = "100"
        _loansListLiveData.value  = emptyList()
    }

    override fun onCleared() {
        super.onCleared()
    }


}