package com.example.pdm2_adam;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CriaBD extends SQLiteOpenHelper{
	private static final String NOME_BD ="MylibPalavrasBD";
	private static final int VERSAO_BD =1;

	public CriaBD(Context ctx) {
		super(ctx, NOME_BD, null, VERSAO_BD);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("create table tbpalavras(_id integer primary key autoincrement, titulo text not null, significado text not null);");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("drop table tbpalavras");
		onCreate(db);
	}

}

