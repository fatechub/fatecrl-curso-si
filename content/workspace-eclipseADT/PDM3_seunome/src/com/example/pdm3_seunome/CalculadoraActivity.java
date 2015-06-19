package com.example.pdm3_seunome;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CalculadoraActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculadora);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculadora, menu);
		return true;
	}

}
