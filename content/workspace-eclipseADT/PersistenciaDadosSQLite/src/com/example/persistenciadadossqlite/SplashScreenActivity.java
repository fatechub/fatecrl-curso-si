package com.example.persistenciadadossqlite;

import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

// https://code.google.com/p/android-ui-utils/
// http://romannurik.github.io/AndroidAssetStudio/

public class SplashScreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
		
		new Timer().schedule(new TimerTask(){
			public void run(){				
				finish();
				Intent it = new Intent();
				it.setClass(SplashScreenActivity.this, MainActivity.class);
				startActivity(it);
			}
		},6000);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash_screen, menu);
		return true;
	}

}
