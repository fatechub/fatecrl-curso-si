package chiara.tp2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Browser extends Activity implements View.OnClickListener {
    Button btnVoltar;
    Button btnAcessar;
    EditText inputPesquisar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);
        inputPesquisar = (EditText)findViewById(R.id.inputPesquisar);
        btnAcessar = (Button)findViewById(R.id.btnAcessar);
        btnAcessar.setOnClickListener(this);
        btnVoltar = (Button)findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch ( v.getId() ) {
            case R.id.btnAcessar:
                Uri uri = Uri.parse( "http://www." + inputPesquisar.getText().toString() );
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