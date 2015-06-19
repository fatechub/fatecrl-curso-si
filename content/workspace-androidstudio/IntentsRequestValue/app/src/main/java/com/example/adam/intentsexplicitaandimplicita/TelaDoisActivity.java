package com.example.adam.intentsexplicitaandimplicita;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;


public class TelaDoisActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_dois);
        Intent it =  getIntent();

        String nome=it.getStringExtra("nome");
        TextView txvNome = (TextView)findViewById(R.id.showNome);
        txvNome.setText(nome);
    }

    public void fim_Click(View v){
        finish();
    }
}
