package chiara.tp2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Caminho extends Activity implements View.OnClickListener {
    Button btnVoltar;
    Button btnAcessar;
    EditText InputOrigem;
    EditText InputDestino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caminho);
        InputOrigem = (EditText)findViewById(R.id.InputSubject);
        InputDestino = (EditText)findViewById(R.id.InputMessage);
        btnAcessar = (Button)findViewById(R.id.btnAcessar);
        btnAcessar.setOnClickListener(this);
        btnVoltar = (Button)findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.btnAcessar:
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.br/maps/dir/" + InputOrigem.getText().toString() + "/" + InputDestino.getText().toString()));
                startActivity(it);
                break;
            case R.id.btnVoltar:
                finish();
            default:
                break;
        }
    }
}
