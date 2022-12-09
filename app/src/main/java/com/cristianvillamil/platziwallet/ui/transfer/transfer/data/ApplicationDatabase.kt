package com.cristianvillamil.platziwallet.ui.transfer.transfer.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.cristianvillamil.platziwallet.ui.home.HomeContract

@Database(entities = [TransferEntity::class], version = 1)
abstract class ApplicationDatabase : RoomDatabase() {
    abstract fun getDAO(): TransfersDAO

    companion object {
        private var INSTANCE: ApplicationDatabase? = null

        fun getAppDatabase(context: Context): ApplicationDatabase? {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    ApplicationDatabase::class.java,
                    "platziWalletDatabase"
                ).allowMainThreadQueries()
                    .build()
            }

            return INSTANCE
        }


        fun destroyInstance() {
            INSTANCE = null
        }
    }
}