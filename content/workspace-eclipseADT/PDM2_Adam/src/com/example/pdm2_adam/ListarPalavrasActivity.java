package com.example.pdm2_adam;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle; 
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListarPalavrasActivity extends ListActivity {
	
	String regPalavra;
	List<Palavra> listPalavras;
	ArrayList<String> listPalavrasString;
	ManipulaBD db;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		listPalavrasString = new ArrayList<String>();
		db = new ManipulaBD(this);
		listPalavras = db.buscar();
		for (Palavra p : listPalavras) {
			regPalavra = p.getId() + ") " + p.getTitulo() + " - " + p.getSignificado();
			listPalavrasString.add(regPalavra);
		}
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listPalavrasString);
		this.setListAdapter(dataAdapter);
	}
	
	@Override
	protected void onListItemClick(ListView l,View v, int position, long id){	
		Toast.makeText(this, "Registro selecionado: " + (position+1), Toast.LENGTH_SHORT).show();	
		Intent it = new Intent(this,EditarPalavraActivity.class);
		
		String getID = "" + listPalavras.get(position).getId();
		String getTitulo = listPalavras.get(position).getTitulo();
		String getSignificado = listPalavras.get(position).getSignificado();
		
		it.putExtra("putID", getID);
		it.putExtra("putTitulo", getTitulo);
		it.putExtra("putSignificado", getSignificado);		
		
		startActivity(it);		
		finish(); // finish a lista pq ele nao precisa mais ver a lista com resultado antigos (não atualiza a lista automaticamnete)
	}	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.listar_palavras, menu);
		return true;
	}
	
	@Override
	public boolean onMenuItemSelected(int panel, MenuItem item) {		
		switch (item.getItemId()) {
		case R.id.action_voltar:
			finish();
			break;	
		}
		return true;
	}

}
