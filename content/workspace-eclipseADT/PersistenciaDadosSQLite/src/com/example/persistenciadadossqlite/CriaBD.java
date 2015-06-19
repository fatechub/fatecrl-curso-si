package com.example.persistenciadadossqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CriaBD extends SQLiteOpenHelper{
	private static final String NOME_BD ="Mylib";
	private static final int VERSAO_BD =1;

	public CriaBD(Context ctx) {
		super(ctx, NOME_BD, null, VERSAO_BD);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("create table tblivro(_id integer primary key autoincrement, titulo text not null, tipo text not null);");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("drop table tblivro");
		onCreate(db);
	}

}
