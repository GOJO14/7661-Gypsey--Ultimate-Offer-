package com.shopify.shopifyapp.dbconnection.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.shopify.shopifyapp.dbconnection.entities.ItemData;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings("unchecked")
public final class ItemDataDao_Impl implements ItemDataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfItemData;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfItemData;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfItemData;

  private final SharedSQLiteStatement __preparedStmtOfDeleteall;

  public ItemDataDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfItemData = new EntityInsertionAdapter<ItemData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `ItemData`(`variant_id`,`productname`,`normalprice`,`specialprice`,`variant_one`,`variant_two`,`variant_three`,`set_strike`,`image`,`offertext`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ItemData value) {
        if (value.variant_id == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.variant_id);
        }
        if (value.productname == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.productname);
        }
        if (value.normalprice == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.normalprice);
        }
        if (value.specialprice == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.specialprice);
        }
        if (value.variant_one == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.variant_one);
        }
        if (value.variant_two == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.variant_two);
        }
        if (value.variant_three == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.variant_three);
        }
        final int _tmp;
        _tmp = value.isSet_strike() ? 1 : 0;
        stmt.bindLong(8, _tmp);
        if (value.image == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.image);
        }
        if (value.offertext == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.offertext);
        }
      }
    };
    this.__deletionAdapterOfItemData = new EntityDeletionOrUpdateAdapter<ItemData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `ItemData` WHERE `variant_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ItemData value) {
        if (value.variant_id == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.variant_id);
        }
      }
    };
    this.__updateAdapterOfItemData = new EntityDeletionOrUpdateAdapter<ItemData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `ItemData` SET `variant_id` = ?,`productname` = ?,`normalprice` = ?,`specialprice` = ?,`variant_one` = ?,`variant_two` = ?,`variant_three` = ?,`set_strike` = ?,`image` = ?,`offertext` = ? WHERE `variant_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ItemData value) {
        if (value.variant_id == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.variant_id);
        }
        if (value.productname == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.productname);
        }
        if (value.normalprice == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.normalprice);
        }
        if (value.specialprice == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.specialprice);
        }
        if (value.variant_one == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.variant_one);
        }
        if (value.variant_two == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.variant_two);
        }
        if (value.variant_three == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.variant_three);
        }
        final int _tmp;
        _tmp = value.isSet_strike() ? 1 : 0;
        stmt.bindLong(8, _tmp);
        if (value.image == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.image);
        }
        if (value.offertext == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.offertext);
        }
        if (value.variant_id == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.variant_id);
        }
      }
    };
    this.__preparedStmtOfDeleteall = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE  FROM itemdata";
        return _query;
      }
    };
  }

  @Override
  public void insert(ItemData data) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfItemData.insert(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(ItemData data) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfItemData.handle(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(ItemData data) {
    __db.beginTransaction();
    try {
      __updateAdapterOfItemData.handle(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
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
  public List<ItemData> getAll() {
    final String _sql = "SELECT * FROM itemdata";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfVariantId = _cursor.getColumnIndexOrThrow("variant_id");
      final int _cursorIndexOfProductname = _cursor.getColumnIndexOrThrow("productname");
      final int _cursorIndexOfNormalprice = _cursor.getColumnIndexOrThrow("normalprice");
      final int _cursorIndexOfSpecialprice = _cursor.getColumnIndexOrThrow("specialprice");
      final int _cursorIndexOfVariantOne = _cursor.getColumnIndexOrThrow("variant_one");
      final int _cursorIndexOfVariantTwo = _cursor.getColumnIndexOrThrow("variant_two");
      final int _cursorIndexOfVariantThree = _cursor.getColumnIndexOrThrow("variant_three");
      final int _cursorIndexOfIsSetStrike = _cursor.getColumnIndexOrThrow("set_strike");
      final int _cursorIndexOfImage = _cursor.getColumnIndexOrThrow("image");
      final int _cursorIndexOfOffertext = _cursor.getColumnIndexOrThrow("offertext");
      final List<ItemData> _result = new ArrayList<ItemData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ItemData _item;
        _item = new ItemData();
        _item.variant_id = _cursor.getString(_cursorIndexOfVariantId);
        _item.productname = _cursor.getString(_cursorIndexOfProductname);
        _item.normalprice = _cursor.getString(_cursorIndexOfNormalprice);
        _item.specialprice = _cursor.getString(_cursorIndexOfSpecialprice);
        _item.variant_one = _cursor.getString(_cursorIndexOfVariantOne);
        _item.variant_two = _cursor.getString(_cursorIndexOfVariantTwo);
        _item.variant_three = _cursor.getString(_cursorIndexOfVariantThree);
        final boolean _tmpIsSet_strike;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsSetStrike);
        _tmpIsSet_strike = _tmp != 0;
        _item.setSet_strike(_tmpIsSet_strike);
        _item.image = _cursor.getString(_cursorIndexOfImage);
        _item.offertext = _cursor.getString(_cursorIndexOfOffertext);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public ItemData getSingleData(String id) {
    final String _sql = "SELECT * FROM itemdata WHERE variant_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfVariantId = _cursor.getColumnIndexOrThrow("variant_id");
      final int _cursorIndexOfProductname = _cursor.getColumnIndexOrThrow("productname");
      final int _cursorIndexOfNormalprice = _cursor.getColumnIndexOrThrow("normalprice");
      final int _cursorIndexOfSpecialprice = _cursor.getColumnIndexOrThrow("specialprice");
      final int _cursorIndexOfVariantOne = _cursor.getColumnIndexOrThrow("variant_one");
      final int _cursorIndexOfVariantTwo = _cursor.getColumnIndexOrThrow("variant_two");
      final int _cursorIndexOfVariantThree = _cursor.getColumnIndexOrThrow("variant_three");
      final int _cursorIndexOfIsSetStrike = _cursor.getColumnIndexOrThrow("set_strike");
      final int _cursorIndexOfImage = _cursor.getColumnIndexOrThrow("image");
      final int _cursorIndexOfOffertext = _cursor.getColumnIndexOrThrow("offertext");
      final ItemData _result;
      if(_cursor.moveToFirst()) {
        _result = new ItemData();
        _result.variant_id = _cursor.getString(_cursorIndexOfVariantId);
        _result.productname = _cursor.getString(_cursorIndexOfProductname);
        _result.normalprice = _cursor.getString(_cursorIndexOfNormalprice);
        _result.specialprice = _cursor.getString(_cursorIndexOfSpecialprice);
        _result.variant_one = _cursor.getString(_cursorIndexOfVariantOne);
        _result.variant_two = _cursor.getString(_cursorIndexOfVariantTwo);
        _result.variant_three = _cursor.getString(_cursorIndexOfVariantThree);
        final boolean _tmpIsSet_strike;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsSetStrike);
        _tmpIsSet_strike = _tmp != 0;
        _result.setSet_strike(_tmpIsSet_strike);
        _result.image = _cursor.getString(_cursorIndexOfImage);
        _result.offertext = _cursor.getString(_cursorIndexOfOffertext);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
