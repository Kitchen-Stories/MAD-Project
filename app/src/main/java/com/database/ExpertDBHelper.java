package com.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ExpertDBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "experts.db";

    public ExpertDBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME , null , 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create Table experts(name TEXT primary key, email TEXT , carrier TEXT , works TEXT)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    //ADDITION TO THE DATABASE
    public Boolean addInfo(String name , String email , String carrier , String works){
        //Grt the data repository in writeMode
        SQLiteDatabase db = this.getWritableDatabase();

        //Create a new map of values , where column names the keys
        ContentValues values = new ContentValues();
        values.put("name" , name);
        values.put("email" , email);
        values.put("carrier" , carrier);
        values.put("works" , works);
        long result = db.insert("experts", null, values);
        if(result==-1) return false;
        else
            return true;
    }
    //DISPLAY
//    public List readAllInfo(){
//        SQLiteDatabase db = getReadableDatabase();
//
//        String[] projection ={
//                ExpertMaster.Experts._ID,
//                ExpertMaster.Experts.NAME,
//                ExpertMaster.Experts.EMAIL,
//                ExpertMaster.Experts.CARRIER,
//                ExpertMaster.Experts.WORKS_AT,
//        };
//
//        String sortOrder = ExpertMaster.Experts.NAME + "DESC";
//
//        Cursor cursor = db.query(
//                ExpertMaster.Experts.TABLE_NAME, //Add experts to query
//                projection,                     //the columns to return
//                null,                   //the columns for the WHERE clause
//                null,               //the values for the WHERE clause
//                null,                  //don't group the rows
//                null,                   //don't filter by row groups
//                sortOrder                      //the sort order
//        );
//        List name = new ArrayList<>();
//        List email = new ArrayList<>();
//        List carrier = new ArrayList<>();
//        List works = new ArrayList<>();
//
//        while (cursor.moveToNext()){
//            String Name = cursor.getString(cursor.getColumnIndexOrThrow(ExpertMaster.Experts.NAME));
//            String Email = cursor.getString(cursor.getColumnIndexOrThrow(ExpertMaster.Experts.EMAIL));
//            String Carrier = cursor.getString(cursor.getColumnIndexOrThrow(ExpertMaster.Experts.CARRIER));
//            String Works = cursor.getString(cursor.getColumnIndexOrThrow(ExpertMaster.Experts.WORKS_AT));
//            name.add(Name);
//            email.add(Email);
//            carrier.add(Carrier);
//            works.add(Works);
//        }
//        cursor.close();
//        return name;
//    }
//    //DELETE
//    public void deleteInfo(String name){
//        SQLiteDatabase db = getReadableDatabase();
//
//        String selection = ExpertMaster.Experts.NAME + " Like ?";
//
//        String[] selectionArgs = { name };
//
//        db.delete(ExpertMaster.Experts.TABLE_NAME , selection ,selectionArgs);
//    }
//    //UPDATE
//    public void updateInfo(String name , String email , String carrier , String works){
//        SQLiteDatabase db = getReadableDatabase();
//
//        ContentValues contentValues = new ContentValues();
//        contentValues.put(ExpertMaster.Experts.NAME , name);
//        contentValues.put(ExpertMaster.Experts.EMAIL , email);
//        contentValues.put(ExpertMaster.Experts.CARRIER , carrier);
//        contentValues.put(ExpertMaster.Experts.WORKS_AT , works);
//
//        String selection = ExpertMaster.Experts.NAME + " LIKE ?";
//        String[] selectionArgs = {name};
//
//        int count = db.update(
//                ExpertMaster.Experts.TABLE_NAME,
//                contentValues,
//                selection,
//                selectionArgs
//        );
//
//    }
}

