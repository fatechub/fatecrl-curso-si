package com.example.eu_000.adam;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MensagemRespostaActivity extends ActionBarActivity implements View.OnClickListener {
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagem_resposta);
        btnVoltar = (Button)findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);

        Intent it =  getIntent();
        String InputTo = it.getStringExtra("InputTo");
        TextView showTo = (TextView)findViewById(R.id.showTo);
        showTo.setText(InputTo);

        String InputMessage = it.getStringExtra("InputMessage");
        TextView showMsg = (TextView)findViewById(R.id.showMsg);
        showMsg.setText(InputMessage);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnVoltar:
                finish();
            default:
                break;
        }
    }
}
