package com.cristianvillamil.platziwallet.ui.home

import androidx.lifecycle.LiveData

class HomeContract {

    interface View{
        fun showLoading()
        fun hideLoading()
        fun showFavoriteTransfers(favoriteTransfer: List<FavoriteTransfer>)
    }

    interface Presenter{
        fun retrieveFavoriteTransfers()
        fun getPercentageLiveData(): LiveData<String>
    }

    interface OnResponseCallback{
        fun  onResponse(favoriteTransfer:List<FavoriteTransfer>)
    }
}