package com.bambey2019.basededonnee;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class StudentDatabaseHelper extends SQLiteOpenHelper {
    private static String DATEBASENAME= "student.db";
    private static int DATAVERSION = 1;
    public StudentDatabaseHelper(Context context) {
        super(context, DATEBASENAME, null, DATAVERSION);
    }
    public void onCreate (SQLiteDatabase db){
        db.execSQL("CREATE TABLE student(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT);");
    }
    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion){
    }
    public void onOpen (SQLiteDatabase db){
        super.onOpen(db);
    }
}
