package com.cristianvillamil.platziwallet.ui.home.presenter

import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer
import com.cristianvillamil.platziwallet.ui.home.HomeContract
import com.cristianvillamil.platziwallet.ui.home.data.HomeInteractor
import java.util.Objects

class HomePresenter(private val homeView: HomeContract.View) : HomeContract.Presenter {
    private val homeInteractor = HomeInteractor()

    override fun retrieveFavoriteTransfers(){
        homeView.showLoading()

        homeInteractor.retrieveFavoriteTransferFormCache(object : HomeContract.OnResponseCallback{
            override fun onResponse(favoriteTransfer: List<FavoriteTransfer>) {

                homeView.hideLoading()
                homeView.showFavoriteTransfers(favoriteTransfer)
            }
        })
    }
}