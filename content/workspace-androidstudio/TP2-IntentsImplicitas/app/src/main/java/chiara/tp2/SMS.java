package chiara.tp2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SMS extends Activity implements View.OnClickListener {
    Button btnVoltar;
    Button btnEnviar;
    EditText InputTo;
    EditText InputMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        InputTo = (EditText)findViewById(R.id.InputTo);
        InputMessage = (EditText)findViewById(R.id.InputMessage);
        btnEnviar = (Button)findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(this);
        btnVoltar = (Button)findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.btnEnviar:
                String InputTox = InputTo.getText().toString();
                String InputMessagex = InputMessage.getText().toString();

                Uri uri = Uri.parse("smsto:"+InputTox);
                Intent it = new Intent(Intent.ACTION_SENDTO, uri);
                it.putExtra("sms_body", InputMessagex);
                startActivity(it);
                break;
            case R.id.btnVoltar:
                finish();
            default:
                break;
        }
    }
}
