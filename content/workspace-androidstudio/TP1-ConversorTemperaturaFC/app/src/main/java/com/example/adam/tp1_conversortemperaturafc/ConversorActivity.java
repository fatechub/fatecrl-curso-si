package com.example.adam.tp1_conversortemperaturafc;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

    public class ConversorActivity extends Activity implements View.OnClickListener {

        Button btnFahrenheit, btnCelsius, btnSobre;
        EditText valTemp;
        TextView txtResp;
        Converte c;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_conversor);
            //---
            btnFahrenheit = (Button)findViewById(R.id.btnFahrenheit);
            btnCelsius = (Button)findViewById(R.id.btnCelsius);
            btnSobre = (Button)findViewById(R.id.btnSobre);
            valTemp = (EditText)findViewById(R.id.valTemp);
            txtResp = (TextView)findViewById(R.id.txtResp);

            btnFahrenheit.setOnClickListener(this);
            btnCelsius.setOnClickListener(this);
            btnSobre.setOnClickListener(this);

            c = new Converte();
        }

        public void onClick( View v ){
            switch ( v.getId() ){
                case R.id.btnFahrenheit:
                    c.viraFahrenheit( Double.parseDouble( valTemp.getText().toString() ) );
                    break;
                case R.id.btnCelsius:
                    c.viraCelsius( Double.parseDouble( valTemp.getText().toString() ) );
                    break;
                case R.id.btnSobre:
                    Intent it = new Intent(this, MainActivity.class);
                    startActivity(it);
                    break;
            }
            txtResp.setText( c.getTemperatura() + "º" );
        }
    }
