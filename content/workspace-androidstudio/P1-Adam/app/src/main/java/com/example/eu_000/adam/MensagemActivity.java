package com.example.eu_000.adam;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MensagemActivity extends ActionBarActivity implements View.OnClickListener {
    private Button btnVoltar;
    private Button btnEnviar;
    private EditText InputTo;
    private EditText InputMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagem);
        btnVoltar = (Button)findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);
        btnEnviar = (Button)findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(this);
        InputTo = (EditText)findViewById(R.id.InputTo);
        InputMessage = (EditText)findViewById(R.id.InputMessage);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnVoltar:
                finish();
                break;
            case R.id.btnEnviar:
                String InputTo = this.InputTo.getText().toString();
                String InputMessage = this.InputMessage.getText().toString();
                Intent it = new Intent(this,MensagemRespostaActivity.class);
                it.putExtra("InputTo",InputTo);
                it.putExtra("InputMessage",InputMessage);
                startActivity(it);
                break;
            default:
                break;
        }
    }
}
