package com.example.pdm2_adam;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;

public class SobreActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sobre);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sobre, menu);
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
