package com.example.pdm3_seunome;

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
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
	public boolean onMenuItemSelected(int panel, MenuItem item) {
		Intent it;
		switch (item.getItemId()) {
		case R.id.action_calculadora:
			it = new Intent(this,CalculadoraActivity.class);
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
