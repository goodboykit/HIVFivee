package com.MainHIV;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MyDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "mydatabase.db";
    private static final int DATABASE_VERSION = 1;

    public MyDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableQuery = "CREATE TABLE IF NOT EXISTS users (" +
                "userId INTEGER PRIMARY KEY AUTOINCREMENT," +
                "fullName TEXT UNIQUE," +
                "userPassword TEXT, " +
                "email TEXT UNIQUE," +
                "phoneNumber TEXT)";
        db.execSQL(createTableQuery);
    }


    public void addUser(String fullName, String password, String email, String phoneNumber) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("fullName", fullName);
        values.put("userPassword", password);
        values.put("email", email);
        values.put("phoneNumber", phoneNumber);

        db.insert("users", null, values);
        db.close();
    }

    public boolean checkUser(String username, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        String[] columns = {"userId"};
        String selection = "fullName = ? AND userPassword = ?";
        String[] selectionArgs = {username, password};
        Cursor cursor = db.query("users", columns, selection, selectionArgs, null, null, null);
        int cursorCount = cursor.getCount();
        cursor.close();
        db.close();
        return cursorCount > 0;
    }

    public void printAllUsers() {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM users";
        Cursor cursor = db.rawQuery(query, null);

        if (cursor.moveToFirst()) {
            do {
                int userId = cursor.getInt(cursor.getColumnIndexOrThrow("userId"));
                String fullName = cursor.getString(cursor.getColumnIndexOrThrow("fullName"));
                String password = cursor.getString(cursor.getColumnIndexOrThrow("userPassword"));
                String email = cursor.getString(cursor.getColumnIndexOrThrow("email"));
                String phoneNumber = cursor.getString(cursor.getColumnIndexOrThrow("phoneNumber"));

                Log.d("DBHelper", "UserId: " + userId + ", FullName: " + fullName + ", Password: " + password +
                        ", Email: " + email + ", PhoneNumber: " + phoneNumber);
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();
    }

    public void clearDatabase() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM users");
        db.close();
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Upgrade your database here (if needed)
        db.execSQL("DROP TABLE IF EXISTS my_table");
        onCreate(db);
    }
}

