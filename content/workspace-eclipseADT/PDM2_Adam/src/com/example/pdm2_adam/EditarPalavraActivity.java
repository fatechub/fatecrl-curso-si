package com.example.pdm2_adam;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class EditarPalavraActivity extends Activity {
	private Palavra palavra = new Palavra();
	private EditText editTextID, editTextTitulo, editTextSignificado;
	private Intent it;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_editar_palavra);
		
		editTextID = (EditText)findViewById(R.id.editTextID);
		editTextTitulo = (EditText)findViewById(R.id.editTextTitulo);
		editTextSignificado = (EditText)findViewById(R.id.editTextSignificado);
		
		it = getIntent();
		
		editTextID.setText( it.getStringExtra("putID") );
		editTextTitulo.setText( it.getStringExtra("putTitulo") );
		editTextSignificado.setText( it.getStringExtra("putSignificado") );		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.editar_palavra, menu);
		return true;
	}
	
	@Override
	public boolean onMenuItemSelected(int panel, MenuItem item) {
		switch (item.getItemId()) {
		case R.id.action_voltar:
			finish();
			break;
		case R.id.action_excluirlivro:
			ManipulaBD bd2 = new ManipulaBD(this);
			palavra.setId( Integer.parseInt( editTextID.getText().toString() ) );
			bd2.deletar(palavra);
			Toast.makeText(this, "Palavra deletada com sucesso", Toast.LENGTH_SHORT).show();
			finish();
			break;
		case R.id.action_salvarlivro:
			palavra.setId( Integer.parseInt( editTextID.getText().toString() ) );		
			palavra.setTitulo( editTextTitulo.getText().toString() );		
			palavra.setSignificado( editTextSignificado.getText().toString() );			
			
			ManipulaBD bd = new ManipulaBD(this);
			bd.atualizar(palavra);
			Toast.makeText(this, "Palavra atualizado com sucesso", Toast.LENGTH_SHORT).show();
			finish();
			break;
		
		}
		return true;
	}

}
