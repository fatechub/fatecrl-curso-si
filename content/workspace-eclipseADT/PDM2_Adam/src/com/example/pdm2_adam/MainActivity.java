package com.example.pdm2_adam;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
	public boolean onMenuItemSelected(int panel, MenuItem item) {
		Intent it;
		switch (item.getItemId()) {
		case R.id.action_criar:
			it = new Intent(this,CadastrarPalavraActivity.class);
			startActivity(it);
			break;
		case R.id.action_palavras:
			it = new Intent(this,ListarPalavrasActivity.class);
			startActivity(it);
			break;
		case R.id.action_sobre:
			it = new Intent(this,SobreActivity.class);
			startActivity(it);
			break;
		
		}
		return true;
	}
    
}
