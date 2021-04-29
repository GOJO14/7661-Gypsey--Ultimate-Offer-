package com.gypsey.shopifyapp.dbconnection.database
import androidx.room.Database
import androidx.room.RoomDatabase
import com.gypsey.shopifyapp.dbconnection.dao.AppLocalDataDao
import com.gypsey.shopifyapp.dbconnection.dao.CartItemDataDao
import com.gypsey.shopifyapp.dbconnection.dao.ItemDataDao
import com.gypsey.shopifyapp.dbconnection.dao.LivePreviewDao
import com.gypsey.shopifyapp.dbconnection.entities.*

@Database(entities = [AppLocalData::class, UserLocalData::class, CustomerTokenData::class, ItemData::class, CartItemData::class, LivePreviewData::class], version = 10)
abstract class AppDatabase : RoomDatabase() {
    abstract val itemDataDao: ItemDataDao
    abstract val cartItemDataDao: CartItemDataDao
    abstract fun appLocalDataDaoDao(): AppLocalDataDao
    abstract fun getLivePreviewDao(): LivePreviewDao
}
