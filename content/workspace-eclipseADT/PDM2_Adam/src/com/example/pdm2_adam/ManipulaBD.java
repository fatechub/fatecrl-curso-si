package com.example.pdm2_adam;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class ManipulaBD {
	private SQLiteDatabase bd;
	
	public ManipulaBD(Context context){
		CriaBD auxBd = new CriaBD(context);
		bd = auxBd.getWritableDatabase();
	}
	
	public void inserir(Palavra p){
		ContentValues valores = new ContentValues();
		valores.put("titulo", p.getTitulo());
		valores.put("significado", p.getSignificado());
		bd.insert("tbpalavras", null, valores);
	}
	
	public void atualizar(Palavra p){
		ContentValues valores = new ContentValues();
		valores.put("titulo", p.getTitulo());
		valores.put("significado", p.getSignificado());
		bd.update("tbpalavras", valores , "_id = ?", new String[]{""+p.getId()});
	}
	
	public void deletar(Palavra p){
		bd.delete("tbpalavras", "_id="+p.getId(), null);
	}	

	public List<Palavra> buscar(){
		List<Palavra> list = new ArrayList<Palavra>();
		String[] colunas = new String[]{"_id", "titulo", "significado"};
		Cursor cursor = bd.query("tbpalavras", colunas, null, null, null, null, "titulo ASC");
		if(cursor.getCount() > 0){
			cursor.moveToFirst();
			do{		
				Palavra l = new Palavra();
				l.setId(cursor.getLong(0));
				l.setTitulo(cursor.getString(1));
				l.setSignificado(cursor.getString(2));
				list.add(l);		
			}while(cursor.moveToNext());
		}
		return(list);
	}
	
}
