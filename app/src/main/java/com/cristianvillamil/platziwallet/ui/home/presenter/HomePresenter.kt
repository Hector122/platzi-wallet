package com.cristianvillamil.platziwallet.ui.home.presenter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer
import com.cristianvillamil.platziwallet.ui.home.HomeContract
import com.cristianvillamil.platziwallet.ui.home.data.HomeInteractor
import com.cristianvillamil.platziwallet.ui.home.data.User
import java.util.Objects

class HomePresenter(private val homeView: HomeContract.View) : HomeContract.Presenter {
    private val homeInteractor = HomeInteractor()

    //LiveData
    val percentageText = MutableLiveData<String>()

    override fun getPercentageLiveData(): LiveData<String> = percentageText

    override fun retrieveFavoriteTransfers() {
        homeView.showLoading()

        homeInteractor.retrieveFavoriteTransferFormCache(object : HomeContract.OnResponseCallback {
            override fun onResponse(favoriteTransfer: List<FavoriteTransfer>) {

                val user = User.Builder()
                    .setUserName("Jhon")
                    .setPassword("kaskdfksafk")
                    .build()

                percentageText.value = "40%"

                homeView.hideLoading()
                homeView.showFavoriteTransfers(favoriteTransfer)
            }
        })
    }
}