private package com.example.pdm2_adam;

import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class CadastrarPalavraActivity extends Activity {
	
	private Palavra palavra = new Palavra();
	private EditText editTextTitulo, editTextSignificado;
	private ManipulaBD db;
	private List<Palavra> resultsPalavras;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastrar_palavra);
		
		editTextTitulo = (EditText)findViewById(R.id.editTextTitulo);
		editTextSignificado = (EditText)findViewById(R.id.editTextSignificado);	
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.cadastrar_palavra, menu);
		return true;
	}
	
	@Override
	public boolean onMenuItemSelected(int panel, MenuItem item) {		
		switch (item.getItemId()) {
		case R.id.action_voltar:
			finish();
			break;
		case R.id.action_criarlivro:
			boolean existeRegistro = false;
			db = new ManipulaBD(this);
			resultsPalavras = db.buscar();
			for (Palavra  p : resultsPalavras) {			
				if ( p.getTitulo().equals( editTextTitulo.getText().toString() ) ){
					existeRegistro = true;
				}
			}			
			if(existeRegistro){
				Toast.makeText(this, "Palavra já existe, escolha outra!", Toast.LENGTH_SHORT).show();
			} else{
				palavra.setTitulo(editTextTitulo.getText().toString());
				palavra.setSignificado(editTextSignificado.getText().toString());
				ManipulaBD bd = new ManipulaBD(this);
				bd.inserir(palavra);
				Toast.makeText(this, "Palavra cadastrada com sucesso", Toast.LENGTH_SHORT).show();
				editTextTitulo.setText("");
				editTextSignificado.setText("");
				break;
			}
		
		}
		return true;
	}

}
