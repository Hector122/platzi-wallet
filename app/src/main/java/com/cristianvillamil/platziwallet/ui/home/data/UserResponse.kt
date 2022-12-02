package com.cristianvillamil.platziwallet.ui.home.data

data class UserResponse(
    val id: String,
    val userName: String,
    val photoUrl: String,
    val token: String,
    val tokenTransfer: String
)