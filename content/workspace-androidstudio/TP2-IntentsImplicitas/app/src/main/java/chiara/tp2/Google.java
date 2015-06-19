package chiara.tp2;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Google extends Activity implements View.OnClickListener {
    private Button btnVoltar;
    private Button btnPesquisar;
    private EditText inputPesquisar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);
        inputPesquisar = (EditText)findViewById(R.id.inputPesquisar);
        btnPesquisar = (Button)findViewById(R.id.btnPesquisar);
        btnPesquisar.setOnClickListener(this);
        btnVoltar = (Button)findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPesquisar:
                Intent it = new Intent();
                it.setAction(Intent.ACTION_WEB_SEARCH);
                it.putExtra( SearchManager.QUERY , inputPesquisar.getText().toString() );
                startActivity(it);
                break;
            case R.id.btnVoltar:
                finish();
            default:
                break;
        }
    }
}
