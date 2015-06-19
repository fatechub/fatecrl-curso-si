package com.example.adam.contador;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{
    TextView txtcont;
    Button btnMais, btnMenos;
    Contador conta = new Contador();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtcont = (TextView) findViewById(R.id.txvContador1);

        btnMais = (Button) findViewById(R.id.btnMais);
        btnMais.setOnClickListener(this);
        btnMenos = (Button) findViewById(R.id.btnMenos);
        btnMenos.setOnClickListener(this);


    }

    public void onClick (View v){

        switch (v.getId()){
            case R.id.btnMais:
                //Toast.makeText(this, "btn Mais"+ v.getId(),Toast.LENGTH_LONG).show();

                conta.incrementa();

                break;

            case R.id.btnMenos:
                //Toast.makeText(this, "btn Menos"+ v.getId(),Toast.LENGTH_LONG).show();
                conta.decrementa();

                break;

        }
        txtcont.setText(""+conta.getConta());

    }
}

