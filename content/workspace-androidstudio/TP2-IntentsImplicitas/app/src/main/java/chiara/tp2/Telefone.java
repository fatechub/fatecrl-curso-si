package chiara.tp2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Telefone extends Activity implements View.OnClickListener {
    Button btnVoltar;
    Button btnLigar;
    Button btnDiscar;
    EditText inputTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telefone);
        inputTelefone = (EditText)findViewById(R.id.inputTelefone);
        btnDiscar = (Button)findViewById(R.id.btnDiscar);
        btnDiscar.setOnClickListener(this);
        btnLigar = (Button)findViewById(R.id.btnLigar);
        btnLigar.setOnClickListener(this);
        btnVoltar = (Button)findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch ( v.getId() ) {
            case R.id.btnDiscar:
                Uri uri = Uri.parse("tel:" + inputTelefone.getText().toString() );
                Intent it = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(it);
                break;
            case R.id.btnLigar:
                Uri uri2 = Uri.parse("tel:" + inputTelefone.getText().toString() );
                Intent it2 = new Intent(Intent.ACTION_CALL, uri2);
                startActivity(it2);
                break;
            case R.id.btnVoltar:
                finish();
            default:
                break;
        }
    }
}