package com.example.persistenciadadossqlite;

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
	
	public void inserir(Livro livro){
		ContentValues valores = new ContentValues();
		valores.put("titulo", livro.getTitulo());
		valores.put("tipo", livro.getTipo());
		bd.insert("tblivro", null, valores);
	}
	
	public void atualizar(Livro livro){
		ContentValues valores = new ContentValues();
		valores.put("titulo", livro.getTitulo());
		valores.put("tipo", livro.getTipo());
		bd.update("tblivro", valores , "_id = ?", new String[]{""+livro.getId()});
	}
	
	public void deletar(Livro livro){
		bd.delete("tblivro", "_id="+livro.getId(), null);
	}
	

	public List<Livro> buscar(){
		List<Livro> list = new ArrayList<Livro>();
		String[] colunas = new String[]{"_id", "titulo", "tipo"};
		Cursor cursor = bd.query("tblivro", colunas, null, null, null, 
				null, "titulo ASC");
		if(cursor.getCount() > 0){
			cursor.moveToFirst();
			do{		
				Livro l = new Livro();
				l.setId(cursor.getLong(0));
				l.setTitulo(cursor.getString(1));
				l.setTipo(cursor.getString(2));
				list.add(l);		
			}while(cursor.moveToNext());
		}
		return(list);
	}
	
}
