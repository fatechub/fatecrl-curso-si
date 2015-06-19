package chiara.tp2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Mapa extends Activity implements View.OnClickListener {
    Button btnVoltar;
    Button btnAcessar;
    EditText InputLatitude;
    EditText InputLongitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        InputLatitude = (EditText)findViewById(R.id.InputLatitude);
        InputLongitude = (EditText)findViewById(R.id.InputLongitude);
        btnAcessar = (Button)findViewById(R.id.btnAcessar);
        btnAcessar.setOnClickListener(this);
        btnVoltar = (Button)findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.btnAcessar:
                // NOTWORK: Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:48.19858,16.37164,171"));
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.br/maps/@" + InputLatitude.getText().toString() + "," + InputLongitude.getText().toString()));
                startActivity(it);
                break;
            case R.id.btnVoltar:
                finish();
            default:
                break;
        }
    }
}
