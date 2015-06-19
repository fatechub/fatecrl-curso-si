package chiara.tp2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MSS extends Activity implements View.OnClickListener {
    Button btnVoltar;
    Button btnEnviar;
    EditText InputTo;
    EditText InputSubject;
    EditText InputMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        InputTo = (EditText)findViewById(R.id.InputTo);
        InputSubject = (EditText)findViewById(R.id.InputSubject);
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
                String InputSubjectx = InputSubject.getText().toString();
                String InputMessagex = InputMessage.getText().toString();

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[] { InputTox });
                email.putExtra(Intent.EXTRA_SUBJECT, InputSubjectx);
                email.putExtra(Intent.EXTRA_TEXT, InputMessagex);

                // need this to prompts email client only
                email.setType("message/rfc822");

                startActivity(Intent.createChooser(email, "Abrir com"));

                break;
            case R.id.btnVoltar:
                finish();
            default:
                break;
        }
    }
}
