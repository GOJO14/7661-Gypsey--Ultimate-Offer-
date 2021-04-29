package com.shopify.shopifyapp.dbconnection.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.shopify.shopifyapp.dbconnection.dao.AppLocalDataDao;
import com.shopify.shopifyapp.dbconnection.dao.AppLocalDataDao_Impl;
import com.shopify.shopifyapp.dbconnection.dao.CartItemDataDao;
import com.shopify.shopifyapp.dbconnection.dao.CartItemDataDao_Impl;
import com.shopify.shopifyapp.dbconnection.dao.ItemDataDao;
import com.shopify.shopifyapp.dbconnection.dao.ItemDataDao_Impl;
import com.shopify.shopifyapp.dbconnection.dao.LivePreviewDao;
import com.shopify.shopifyapp.dbconnection.dao.LivePreviewDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings("unchecked")
public final class AppDatabase_Impl extends AppDatabase {
  private volatile ItemDataDao _itemDataDao;

  private volatile CartItemDataDao _cartItemDataDao;

  private volatile AppLocalDataDao _appLocalDataDao;

  private volatile LivePreviewDao _livePreviewDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(8) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `AppLocalData` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `istrialexpire` INTEGER NOT NULL, `trialexpiredata` TEXT, `currencycode` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `UserLocalData` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `firstname` TEXT, `lastname` TEXT, `email` TEXT, `password` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CustomerTokenData` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `ExpireTime` TEXT, `email` TEXT, `CustomerAccessToken` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ItemData` (`variant_id` TEXT NOT NULL, `productname` TEXT NOT NULL, `normalprice` TEXT NOT NULL, `specialprice` TEXT NOT NULL, `variant_one` TEXT NOT NULL, `variant_two` TEXT NOT NULL, `variant_three` TEXT NOT NULL, `set_strike` INTEGER NOT NULL, `image` TEXT NOT NULL, `offertext` TEXT NOT NULL, PRIMARY KEY(`variant_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CartItemData` (`variant_id` TEXT NOT NULL, `qty` INTEGER NOT NULL, PRIMARY KEY(`variant_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `LivePreviewData` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mid` TEXT, `shopurl` TEXT, `apikey` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"2a04cf03a57826a2373da6352c946ba9\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `AppLocalData`");
        _db.execSQL("DROP TABLE IF EXISTS `UserLocalData`");
        _db.execSQL("DROP TABLE IF EXISTS `CustomerTokenData`");
        _db.execSQL("DROP TABLE IF EXISTS `ItemData`");
        _db.execSQL("DROP TABLE IF EXISTS `CartItemData`");
        _db.execSQL("DROP TABLE IF EXISTS `LivePreviewData`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsAppLocalData = new HashMap<String, TableInfo.Column>(4);
        _columnsAppLocalData.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsAppLocalData.put("istrialexpire", new TableInfo.Column("istrialexpire", "INTEGER", true, 0));
        _columnsAppLocalData.put("trialexpiredata", new TableInfo.Column("trialexpiredata", "TEXT", false, 0));
        _columnsAppLocalData.put("currencycode", new TableInfo.Column("currencycode", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAppLocalData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAppLocalData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAppLocalData = new TableInfo("AppLocalData", _columnsAppLocalData, _foreignKeysAppLocalData, _indicesAppLocalData);
        final TableInfo _existingAppLocalData = TableInfo.read(_db, "AppLocalData");
        if (! _infoAppLocalData.equals(_existingAppLocalData)) {
          throw new IllegalStateException("Migration didn't properly handle AppLocalData(com.shopify.shopifyapp.dbconnection.entities.AppLocalData).\n"
                  + " Expected:\n" + _infoAppLocalData + "\n"
                  + " Found:\n" + _existingAppLocalData);
        }
        final HashMap<String, TableInfo.Column> _columnsUserLocalData = new HashMap<String, TableInfo.Column>(5);
        _columnsUserLocalData.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsUserLocalData.put("firstname", new TableInfo.Column("firstname", "TEXT", false, 0));
        _columnsUserLocalData.put("lastname", new TableInfo.Column("lastname", "TEXT", false, 0));
        _columnsUserLocalData.put("email", new TableInfo.Column("email", "TEXT", false, 0));
        _columnsUserLocalData.put("password", new TableInfo.Column("password", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserLocalData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserLocalData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserLocalData = new TableInfo("UserLocalData", _columnsUserLocalData, _foreignKeysUserLocalData, _indicesUserLocalData);
        final TableInfo _existingUserLocalData = TableInfo.read(_db, "UserLocalData");
        if (! _infoUserLocalData.equals(_existingUserLocalData)) {
          throw new IllegalStateException("Migration didn't properly handle UserLocalData(com.shopify.shopifyapp.dbconnection.entities.UserLocalData).\n"
                  + " Expected:\n" + _infoUserLocalData + "\n"
                  + " Found:\n" + _existingUserLocalData);
        }
        final HashMap<String, TableInfo.Column> _columnsCustomerTokenData = new HashMap<String, TableInfo.Column>(4);
        _columnsCustomerTokenData.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsCustomerTokenData.put("ExpireTime", new TableInfo.Column("ExpireTime", "TEXT", false, 0));
        _columnsCustomerTokenData.put("email", new TableInfo.Column("email", "TEXT", false, 0));
        _columnsCustomerTokenData.put("CustomerAccessToken", new TableInfo.Column("CustomerAccessToken", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCustomerTokenData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCustomerTokenData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCustomerTokenData = new TableInfo("CustomerTokenData", _columnsCustomerTokenData, _foreignKeysCustomerTokenData, _indicesCustomerTokenData);
        final TableInfo _existingCustomerTokenData = TableInfo.read(_db, "CustomerTokenData");
        if (! _infoCustomerTokenData.equals(_existingCustomerTokenData)) {
          throw new IllegalStateException("Migration didn't properly handle CustomerTokenData(com.shopify.shopifyapp.dbconnection.entities.CustomerTokenData).\n"
                  + " Expected:\n" + _infoCustomerTokenData + "\n"
                  + " Found:\n" + _existingCustomerTokenData);
        }
        final HashMap<String, TableInfo.Column> _columnsItemData = new HashMap<String, TableInfo.Column>(10);
        _columnsItemData.put("variant_id", new TableInfo.Column("variant_id", "TEXT", true, 1));
        _columnsItemData.put("productname", new TableInfo.Column("productname", "TEXT", true, 0));
        _columnsItemData.put("normalprice", new TableInfo.Column("normalprice", "TEXT", true, 0));
        _columnsItemData.put("specialprice", new TableInfo.Column("specialprice", "TEXT", true, 0));
        _columnsItemData.put("variant_one", new TableInfo.Column("variant_one", "TEXT", true, 0));
        _columnsItemData.put("variant_two", new TableInfo.Column("variant_two", "TEXT", true, 0));
        _columnsItemData.put("variant_three", new TableInfo.Column("variant_three", "TEXT", true, 0));
        _columnsItemData.put("set_strike", new TableInfo.Column("set_strike", "INTEGER", true, 0));
        _columnsItemData.put("image", new TableInfo.Column("image", "TEXT", true, 0));
        _columnsItemData.put("offertext", new TableInfo.Column("offertext", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysItemData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesItemData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoItemData = new TableInfo("ItemData", _columnsItemData, _foreignKeysItemData, _indicesItemData);
        final TableInfo _existingItemData = TableInfo.read(_db, "ItemData");
        if (! _infoItemData.equals(_existingItemData)) {
          throw new IllegalStateException("Migration didn't properly handle ItemData(com.shopify.shopifyapp.dbconnection.entities.ItemData).\n"
                  + " Expected:\n" + _infoItemData + "\n"
                  + " Found:\n" + _existingItemData);
        }
        final HashMap<String, TableInfo.Column> _columnsCartItemData = new HashMap<String, TableInfo.Column>(2);
        _columnsCartItemData.put("variant_id", new TableInfo.Column("variant_id", "TEXT", true, 1));
        _columnsCartItemData.put("qty", new TableInfo.Column("qty", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCartItemData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCartItemData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCartItemData = new TableInfo("CartItemData", _columnsCartItemData, _foreignKeysCartItemData, _indicesCartItemData);
        final TableInfo _existingCartItemData = TableInfo.read(_db, "CartItemData");
        if (! _infoCartItemData.equals(_existingCartItemData)) {
          throw new IllegalStateException("Migration didn't properly handle CartItemData(com.shopify.shopifyapp.dbconnection.entities.CartItemData).\n"
                  + " Expected:\n" + _infoCartItemData + "\n"
                  + " Found:\n" + _existingCartItemData);
        }
        final HashMap<String, TableInfo.Column> _columnsLivePreviewData = new HashMap<String, TableInfo.Column>(4);
        _columnsLivePreviewData.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsLivePreviewData.put("mid", new TableInfo.Column("mid", "TEXT", false, 0));
        _columnsLivePreviewData.put("shopurl", new TableInfo.Column("shopurl", "TEXT", false, 0));
        _columnsLivePreviewData.put("apikey", new TableInfo.Column("apikey", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLivePreviewData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLivePreviewData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLivePreviewData = new TableInfo("LivePreviewData", _columnsLivePreviewData, _foreignKeysLivePreviewData, _indicesLivePreviewData);
        final TableInfo _existingLivePreviewData = TableInfo.read(_db, "LivePreviewData");
        if (! _infoLivePreviewData.equals(_existingLivePreviewData)) {
          throw new IllegalStateException("Migration didn't properly handle LivePreviewData(com.shopify.shopifyapp.dbconnection.entities.LivePreviewData).\n"
                  + " Expected:\n" + _infoLivePreviewData + "\n"
                  + " Found:\n" + _existingLivePreviewData);
        }
      }
    }, "2a04cf03a57826a2373da6352c946ba9", "1a5dc11266811650cf6502e84c735fbb");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "AppLocalData","UserLocalData","CustomerTokenData","ItemData","CartItemData","LivePreviewData");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `AppLocalData`");
      _db.execSQL("DELETE FROM `UserLocalData`");
      _db.execSQL("DELETE FROM `CustomerTokenData`");
      _db.execSQL("DELETE FROM `ItemData`");
      _db.execSQL("DELETE FROM `CartItemData`");
      _db.execSQL("DELETE FROM `LivePreviewData`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public ItemDataDao getItemDataDao() {
    if (_itemDataDao != null) {
      return _itemDataDao;
    } else {
      synchronized(this) {
        if(_itemDataDao == null) {
          _itemDataDao = new ItemDataDao_Impl(this);
        }
        return _itemDataDao;
      }
    }
  }

  @Override
  public CartItemDataDao getCartItemDataDao() {
    if (_cartItemDataDao != null) {
      return _cartItemDataDao;
    } else {
      synchronized(this) {
        if(_cartItemDataDao == null) {
          _cartItemDataDao = new CartItemDataDao_Impl(this);
        }
        return _cartItemDataDao;
      }
    }
  }

  @Override
  public AppLocalDataDao appLocalDataDaoDao() {
    if (_appLocalDataDao != null) {
      return _appLocalDataDao;
    } else {
      synchronized(this) {
        if(_appLocalDataDao == null) {
          _appLocalDataDao = new AppLocalDataDao_Impl(this);
        }
        return _appLocalDataDao;
      }
    }
  }

  @Override
  public LivePreviewDao getLivePreviewDao() {
    if (_livePreviewDao != null) {
      return _livePreviewDao;
    } else {
      synchronized(this) {
        if(_livePreviewDao == null) {
          _livePreviewDao = new LivePreviewDao_Impl(this);
        }
        return _livePreviewDao;
      }
    }
  }
}
