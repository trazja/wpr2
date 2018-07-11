package tryhut.wpr;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by tryhu on 2018-07-10.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Users.db";
    private static final String TABLE_NAME = "Users";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_LASTNAME = "lastName";
    private static final String COLUMN_USERNAME = "userName";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_PASSWORD = "password";

    SQLiteDatabase db;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table Users(id int primary key not null , name text not null, lastName text not null, userName text not null, " +
                "email text not null, password text not null )");

        this.db = db;
    }

    public void insertContact(Contact u) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, u.getName());
        values.put(COLUMN_LASTNAME, u.getLastName());
        values.put(COLUMN_USERNAME, u.getUserName());
        values.put(COLUMN_EMAIL, u.getEmail());
        values.put(COLUMN_PASSWORD, u.getPassword());

        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public String searchPass(String userName) {
        db = this.getReadableDatabase();
        String query = "SELECT USERNAME, PASSWORD FROM" + TABLE_NAME;
        String a, b; //a username, b password
        b = "not found";
        Cursor cursor = db.rawQuery(query, null);

        if (cursor.moveToFirst()) {
            do {
                a = cursor.getString(0);


                if (a.equals(userName)) {
                    b = cursor.getString(1);
                    break;
                }
            } while (cursor.moveToNext());

        }
        return b;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS" + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }


}
