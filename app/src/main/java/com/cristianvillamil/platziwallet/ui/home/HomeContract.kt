package com.cristianvillamil.platziwallet.ui.home

class HomeContract {

    interface View{
        fun showLoading()
        fun hideLoading()
        fun showFavoriteTransfers(favoriteTransfer: List<FavoriteTransfer>)
    }

    interface Presenter{
        fun retrieveFavoriteTransfers()
    }

    interface OnResponseCallback{
        fun  onResponse(favoriteTransfer:List<FavoriteTransfer>)
    }
}