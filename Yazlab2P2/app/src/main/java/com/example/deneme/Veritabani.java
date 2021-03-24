package com.example.deneme;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Veritabani extends SQLiteOpenHelper {
    private static final String Database_name="veritabani";
    private static final int Database_version=1;

    public Veritabani(@Nullable Context context) {
        super(context,Database_name,null,Database_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="create table Puan_tablosu (id integer primary key autoincrement , seviye text not null,puan integer)";

        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql="drop table if exists Puan_tablosu";
        db.execSQL(sql);
        onCreate(db);
    }

    public void Veri_ekle(String seviye,int puan){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("seviye",seviye);
        cv.put("puan",puan);
        db.insert("Puan_tablosu",null,cv);
        db.close();

    }

    public List<String> Veri_Listele(){
        List<String> veriler=new ArrayList<String>();

        SQLiteDatabase db =this.getWritableDatabase();
        String[] sutunlar={"id,seviye,puan"};
        Cursor cursor=db.query("Puan_tablosu",sutunlar,null,null,null,null,null);
        while (cursor.moveToNext()){
            veriler.add(cursor.getInt(0)+"-"+cursor.getString(1)+"-"+cursor.getInt(2));
        }

        return veriler;
    }

    public void hepsinisil(SQLiteDatabase db){
        String sql="drop table if exists Puan_tablosu";
        db.execSQL(sql);
        onCreate(db);
    }

    public void Veri_Sil(long id){
        SQLiteDatabase db=this.getWritableDatabase();
        db.delete("Puan_tablosu","id-"+id,null);
        db.close();
    }

}
