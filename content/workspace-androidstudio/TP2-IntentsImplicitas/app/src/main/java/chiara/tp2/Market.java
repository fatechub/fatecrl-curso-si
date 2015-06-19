package chiara.tp2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Market extends Activity implements View.OnClickListener {
    private Button btnVoltar;
    private Button btnPesquisar;
    private EditText inputPesquisarApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);
        inputPesquisarApp = (EditText)findViewById(R.id.inputPesquisarApp);
        btnPesquisar = (Button)findViewById(R.id.btnPesquisar);
        btnPesquisar.setOnClickListener(this);
        btnVoltar = (Button)findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPesquisar:
                Uri uri = Uri.parse( "https://play.google.com/store/search?q=" + inputPesquisarApp.getText().toString() + "&hl=pt-Br");
                Intent it = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(it);
                break;
            case R.id.btnVoltar:
                finish();
            default:
                break;
        }
    }
}