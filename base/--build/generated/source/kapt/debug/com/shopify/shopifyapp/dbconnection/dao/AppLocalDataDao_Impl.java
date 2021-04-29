package com.shopify.shopifyapp.dbconnection.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.shopify.shopifyapp.dbconnection.entities.AppLocalData;
import com.shopify.shopifyapp.dbconnection.entities.CustomerTokenData;
import com.shopify.shopifyapp.dbconnection.entities.UserLocalData;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings("unchecked")
public final class AppLocalDataDao_Impl implements AppLocalDataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfAppLocalData;

  private final EntityInsertionAdapter __insertionAdapterOfUserLocalData;

  private final EntityInsertionAdapter __insertionAdapterOfCustomerTokenData;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfAppLocalData;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfUserLocalData;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfCustomerTokenData;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfAppLocalData;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfUserLocalData;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfCustomerTokenData;

  private final SharedSQLiteStatement __preparedStmtOfDeletealldata;

  private final SharedSQLiteStatement __preparedStmtOfDeleteall;

  public AppLocalDataDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAppLocalData = new EntityInsertionAdapter<AppLocalData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `AppLocalData`(`id`,`istrialexpire`,`trialexpiredata`,`currencycode`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppLocalData value) {
        stmt.bindLong(1, value.getId());
        final int _tmp;
        _tmp = value.isIstrialexpire() ? 1 : 0;
        stmt.bindLong(2, _tmp);
        if (value.getTrialexpiredata() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTrialexpiredata());
        }
        if (value.getCurrencycode() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCurrencycode());
        }
      }
    };
    this.__insertionAdapterOfUserLocalData = new EntityInsertionAdapter<UserLocalData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `UserLocalData`(`id`,`firstname`,`lastname`,`email`,`password`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserLocalData value) {
        stmt.bindLong(1, value.getId());
        if (value.getFirstname() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFirstname());
        }
        if (value.getLastname() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLastname());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPassword());
        }
      }
    };
    this.__insertionAdapterOfCustomerTokenData = new EntityInsertionAdapter<CustomerTokenData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `CustomerTokenData`(`id`,`ExpireTime`,`email`,`CustomerAccessToken`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CustomerTokenData value) {
        stmt.bindLong(1, value.getId());
        if (value.getExpireTime() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getExpireTime());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        if (value.getCustomerAccessToken() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCustomerAccessToken());
        }
      }
    };
    this.__deletionAdapterOfAppLocalData = new EntityDeletionOrUpdateAdapter<AppLocalData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `AppLocalData` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppLocalData value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__deletionAdapterOfUserLocalData = new EntityDeletionOrUpdateAdapter<UserLocalData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `UserLocalData` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserLocalData value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__deletionAdapterOfCustomerTokenData = new EntityDeletionOrUpdateAdapter<CustomerTokenData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `CustomerTokenData` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CustomerTokenData value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfAppLocalData = new EntityDeletionOrUpdateAdapter<AppLocalData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `AppLocalData` SET `id` = ?,`istrialexpire` = ?,`trialexpiredata` = ?,`currencycode` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppLocalData value) {
        stmt.bindLong(1, value.getId());
        final int _tmp;
        _tmp = value.isIstrialexpire() ? 1 : 0;
        stmt.bindLong(2, _tmp);
        if (value.getTrialexpiredata() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTrialexpiredata());
        }
        if (value.getCurrencycode() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCurrencycode());
        }
        stmt.bindLong(5, value.getId());
      }
    };
    this.__updateAdapterOfUserLocalData = new EntityDeletionOrUpdateAdapter<UserLocalData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `UserLocalData` SET `id` = ?,`firstname` = ?,`lastname` = ?,`email` = ?,`password` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserLocalData value) {
        stmt.bindLong(1, value.getId());
        if (value.getFirstname() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFirstname());
        }
        if (value.getLastname() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLastname());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPassword());
        }
        stmt.bindLong(6, value.getId());
      }
    };
    this.__updateAdapterOfCustomerTokenData = new EntityDeletionOrUpdateAdapter<CustomerTokenData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `CustomerTokenData` SET `id` = ?,`ExpireTime` = ?,`email` = ?,`CustomerAccessToken` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CustomerTokenData value) {
        stmt.bindLong(1, value.getId());
        if (value.getExpireTime() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getExpireTime());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        if (value.getCustomerAccessToken() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCustomerAccessToken());
        }
        stmt.bindLong(5, value.getId());
      }
    };
    this.__preparedStmtOfDeletealldata = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE  FROM UserLocalData";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteall = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE  FROM CustomerTokenData";
        return _query;
      }
    };
  }

  @Override
  public void insert(AppLocalData appLocalData) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfAppLocalData.insert(appLocalData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertUserData(UserLocalData UserLocalData) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserLocalData.insert(UserLocalData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void InsertCustomerToken(CustomerTokenData customerTokenData) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfCustomerTokenData.insert(customerTokenData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(AppLocalData appLocalData) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfAppLocalData.handle(appLocalData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteUserData(UserLocalData UserLocalData) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfUserLocalData.handle(UserLocalData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteCustomerToken(CustomerTokenData CustomerTokenData) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfCustomerTokenData.handle(CustomerTokenData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(AppLocalData appLocalData) {
    __db.beginTransaction();
    try {
      __updateAdapterOfAppLocalData.handle(appLocalData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateUserData(UserLocalData UserLocalData) {
    __db.beginTransaction();
    try {
      __updateAdapterOfUserLocalData.handle(UserLocalData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void UpdateCustomerToken(CustomerTokenData customerTokenData) {
    __db.beginTransaction();
    try {
      __updateAdapterOfCustomerTokenData.handle(customerTokenData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deletealldata() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeletealldata.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeletealldata.release(_stmt);
    }
  }

  @Override
  public void deleteall() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteall.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteall.release(_stmt);
    }
  }

  @Override
  public List<AppLocalData> getAll() {
    final String _sql = "SELECT * FROM applocaldata";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfIsIstrialexpire = _cursor.getColumnIndexOrThrow("istrialexpire");
      final int _cursorIndexOfTrialexpiredata = _cursor.getColumnIndexOrThrow("trialexpiredata");
      final int _cursorIndexOfCurrencycode = _cursor.getColumnIndexOrThrow("currencycode");
      final List<AppLocalData> _result = new ArrayList<AppLocalData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final AppLocalData _item;
        _item = new AppLocalData();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final boolean _tmpIsIstrialexpire;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsIstrialexpire);
        _tmpIsIstrialexpire = _tmp != 0;
        _item.setIstrialexpire(_tmpIsIstrialexpire);
        final String _tmpTrialexpiredata;
        _tmpTrialexpiredata = _cursor.getString(_cursorIndexOfTrialexpiredata);
        _item.setTrialexpiredata(_tmpTrialexpiredata);
        final String _tmpCurrencycode;
        _tmpCurrencycode = _cursor.getString(_cursorIndexOfCurrencycode);
        _item.setCurrencycode(_tmpCurrencycode);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<UserLocalData> getAllUserData() {
    final String _sql = "SELECT * FROM UserLocalData";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfFirstname = _cursor.getColumnIndexOrThrow("firstname");
      final int _cursorIndexOfLastname = _cursor.getColumnIndexOrThrow("lastname");
      final int _cursorIndexOfEmail = _cursor.getColumnIndexOrThrow("email");
      final int _cursorIndexOfPassword = _cursor.getColumnIndexOrThrow("password");
      final List<UserLocalData> _result = new ArrayList<UserLocalData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final UserLocalData _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpFirstname;
        _tmpFirstname = _cursor.getString(_cursorIndexOfFirstname);
        final String _tmpLastname;
        _tmpLastname = _cursor.getString(_cursorIndexOfLastname);
        final String _tmpEmail;
        _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        final String _tmpPassword;
        _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
        _item = new UserLocalData(_tmpId,_tmpFirstname,_tmpLastname,_tmpEmail,_tmpPassword);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<CustomerTokenData> getCustomerToken() {
    final String _sql = "SELECT * FROM CustomerTokenData";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfExpireTime = _cursor.getColumnIndexOrThrow("ExpireTime");
      final int _cursorIndexOfEmail = _cursor.getColumnIndexOrThrow("email");
      final int _cursorIndexOfCustomerAccessToken = _cursor.getColumnIndexOrThrow("CustomerAccessToken");
      final List<CustomerTokenData> _result = new ArrayList<CustomerTokenData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CustomerTokenData _item;
        final String _tmpExpireTime;
        _tmpExpireTime = _cursor.getString(_cursorIndexOfExpireTime);
        final String _tmpCustomerAccessToken;
        _tmpCustomerAccessToken = _cursor.getString(_cursorIndexOfCustomerAccessToken);
        _item = new CustomerTokenData(_tmpCustomerAccessToken,_tmpExpireTime);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpEmail;
        _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        _item.setEmail(_tmpEmail);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
