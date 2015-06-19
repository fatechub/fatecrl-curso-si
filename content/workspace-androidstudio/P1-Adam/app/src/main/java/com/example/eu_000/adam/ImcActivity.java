package com.example.eu_000.adam;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class ImcActivity extends ActionBarActivity implements View.OnClickListener {
    private Button btnVoltar, btnEnviar, btnResetar;
    private EditText InputPeso, InputAltura;
    private TextView txtResp;
    private String resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        btnVoltar = (Button)findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);
        btnEnviar = (Button)findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(this);
        btnResetar = (Button)findViewById(R.id.btnResetar);
        btnResetar.setOnClickListener(this);
        InputPeso = (EditText)findViewById(R.id.InputPeso);
        InputAltura = (EditText)findViewById(R.id.InputAltura);
        txtResp = (TextView)findViewById(R.id.txtResp);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnEnviar:
                Toast.makeText(this, "Calculando...", Toast.LENGTH_SHORT).show();
                Double peso = Double.parseDouble( InputPeso.getText().toString() );
                Double altura = Double.parseDouble( InputAltura.getText().toString() );
                Double imc = peso/(altura*2);
                if (imc < 16.0) {
                    resultado = "Magreza grave";
                } else if (imc >16.0 && imc < 18.5){
                    resultado = "Magreza leve/moderada";
                } else if (imc >18.5 && imc < 25.0){
                    resultado = "Saudável";
                } else if (imc >25.0 && imc < 35.0){
                    resultado = "Sobrepeso";
                } else if (imc >30.0 && imc < 40.0){
                    resultado = "Obesidade Graus I e II";
                } else if (imc > 40.0) {
                    resultado = "Obesidade Graus III (mórbida)";
                } else {
                    resultado = "";
                }
                txtResp.setText( "Resultado é: " + resultado );
                break;
            case R.id.btnResetar:
                txtResp.setText( "" );
                InputPeso.setText( null );
                InputAltura.setText( null );
                break;
            case R.id.btnVoltar:
                finish();
                break;
            default:
                break;
        }
    }
}

