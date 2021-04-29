package com.shopify.shopifyapp.dbconnection.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.shopify.shopifyapp.dbconnection.entities.LivePreviewData;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings("unchecked")
public final class LivePreviewDao_Impl implements LivePreviewDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfLivePreviewData;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfLivePreviewData;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfLivePreviewData;

  public LivePreviewDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLivePreviewData = new EntityInsertionAdapter<LivePreviewData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `LivePreviewData`(`id`,`mid`,`shopurl`,`apikey`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LivePreviewData value) {
        stmt.bindLong(1, value.getId());
        if (value.getMid() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMid());
        }
        if (value.getShopurl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getShopurl());
        }
        if (value.getApikey() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getApikey());
        }
      }
    };
    this.__deletionAdapterOfLivePreviewData = new EntityDeletionOrUpdateAdapter<LivePreviewData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `LivePreviewData` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LivePreviewData value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfLivePreviewData = new EntityDeletionOrUpdateAdapter<LivePreviewData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `LivePreviewData` SET `id` = ?,`mid` = ?,`shopurl` = ?,`apikey` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LivePreviewData value) {
        stmt.bindLong(1, value.getId());
        if (value.getMid() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMid());
        }
        if (value.getShopurl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getShopurl());
        }
        if (value.getApikey() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getApikey());
        }
        stmt.bindLong(5, value.getId());
      }
    };
  }

  @Override
  public void insert(LivePreviewData data) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfLivePreviewData.insert(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(LivePreviewData data) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfLivePreviewData.handle(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(LivePreviewData data) {
    __db.beginTransaction();
    try {
      __updateAdapterOfLivePreviewData.handle(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<LivePreviewData> getGetPreviewDetails() {
    final String _sql = "SELECT * FROM LivePreviewData";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfMid = _cursor.getColumnIndexOrThrow("mid");
      final int _cursorIndexOfShopurl = _cursor.getColumnIndexOrThrow("shopurl");
      final int _cursorIndexOfApikey = _cursor.getColumnIndexOrThrow("apikey");
      final List<LivePreviewData> _result = new ArrayList<LivePreviewData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final LivePreviewData _item;
        final String _tmpMid;
        _tmpMid = _cursor.getString(_cursorIndexOfMid);
        final String _tmpShopurl;
        _tmpShopurl = _cursor.getString(_cursorIndexOfShopurl);
        final String _tmpApikey;
        _tmpApikey = _cursor.getString(_cursorIndexOfApikey);
        _item = new LivePreviewData(_tmpMid,_tmpShopurl,_tmpApikey);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
