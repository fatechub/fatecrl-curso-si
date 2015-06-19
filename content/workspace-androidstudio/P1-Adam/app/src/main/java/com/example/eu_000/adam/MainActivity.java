package com.example.eu_000.adam;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        switch (id){
            case R.id.action_msg:
                Toast.makeText(this, "Mensagem", Toast.LENGTH_SHORT).show();
                Intent it  = new Intent(this, MensagemActivity.class);
                startActivity(it);
            break;
            case R.id.action_imc:
                Intent it2  = new Intent(this, ImcActivity.class);
                startActivity(it2);
                Toast.makeText(this, "IMC", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_sobre:
                Intent it3  = new Intent(this, SobreActivity.class);
                startActivity(it3);
                Toast.makeText(this, "Sobre", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
