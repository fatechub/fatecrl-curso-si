package com.example.adam.intentsexplicitasandimplicitas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickIntentExplicita (View v) {
        Intent it  = new Intent(this, IntentExplicitaActivity.class);
        startActivity(it);
    }

    public void clickIntentImplicita (View v){
        /*
        Tem que dar permissao no Arquivo de Manifesto

        ... package="com.example.adam.intentsexplicitasandimplicitas" >

                    <uses-permission android:name="android.permission.INTERNET"/>
                    <uses-permission android:name="android.permission.CALL_PHONE"/>
                    <uses-permission android:name="android.permission.WRITE_SMS"/>

            <application ....
         */
        Uri uri = Uri.parse("http://www.google.com");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
