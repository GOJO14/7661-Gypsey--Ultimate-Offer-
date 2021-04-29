package com.shopify.shopifyapp.dbconnection.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.shopify.shopifyapp.dbconnection.entities.CartItemData;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings("unchecked")
public final class CartItemDataDao_Impl implements CartItemDataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCartItemData;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfCartItemData;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfCartItemData;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCart;

  public CartItemDataDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCartItemData = new EntityInsertionAdapter<CartItemData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `CartItemData`(`variant_id`,`qty`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CartItemData value) {
        if (value.variant_id == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.variant_id);
        }
        stmt.bindLong(2, value.getQty());
      }
    };
    this.__deletionAdapterOfCartItemData = new EntityDeletionOrUpdateAdapter<CartItemData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `CartItemData` WHERE `variant_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CartItemData value) {
        if (value.variant_id == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.variant_id);
        }
      }
    };
    this.__updateAdapterOfCartItemData = new EntityDeletionOrUpdateAdapter<CartItemData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `CartItemData` SET `variant_id` = ?,`qty` = ? WHERE `variant_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CartItemData value) {
        if (value.variant_id == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.variant_id);
        }
        stmt.bindLong(2, value.getQty());
        if (value.variant_id == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.variant_id);
        }
      }
    };
    this.__preparedStmtOfDeleteCart = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE  FROM cartitemdata";
        return _query;
      }
    };
  }

  @Override
  public void insert(CartItemData data) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfCartItemData.insert(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(CartItemData data) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfCartItemData.handle(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(CartItemData data) {
    __db.beginTransaction();
    try {
      __updateAdapterOfCartItemData.handle(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteCart() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCart.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteCart.release(_stmt);
    }
  }

  @Override
  public List<CartItemData> getAll() {
    final String _sql = "SELECT * FROM cartitemdata";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfVariantId = _cursor.getColumnIndexOrThrow("variant_id");
      final int _cursorIndexOfQty = _cursor.getColumnIndexOrThrow("qty");
      final List<CartItemData> _result = new ArrayList<CartItemData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CartItemData _item;
        _item = new CartItemData();
        _item.variant_id = _cursor.getString(_cursorIndexOfVariantId);
        final int _tmpQty;
        _tmpQty = _cursor.getInt(_cursorIndexOfQty);
        _item.setQty(_tmpQty);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public CartItemData getSingleData(String id) {
    final String _sql = "SELECT * FROM cartitemdata WHERE variant_id = ?";
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
      final int _cursorIndexOfQty = _cursor.getColumnIndexOrThrow("qty");
      final CartItemData _result;
      if(_cursor.moveToFirst()) {
        _result = new CartItemData();
        _result.variant_id = _cursor.getString(_cursorIndexOfVariantId);
        final int _tmpQty;
        _tmpQty = _cursor.getInt(_cursorIndexOfQty);
        _result.setQty(_tmpQty);
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
