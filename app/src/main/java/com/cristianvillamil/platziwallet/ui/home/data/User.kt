package com.cristianvillamil.platziwallet.ui.home.data

class User private constructor(private val userName: String, private val password: String?) {
    class Builder{
        private var userName: String = ""
        private var password: String? = null

        fun setUserName(userName: String):Builder{
            this.userName = userName
            return this
        }

        fun setPassword(password: String?):Builder {
            this.password = password
            return this
        }

        fun build():User{
            return User(userName, password)
        }
    }
}