package com.fatecrl.persistenciadadossqlite;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class EditLivroActivity extends Activity {
    private Livro livro = new Livro();
    private EditText edtTitulo, edtID;
    private Intent it;
    private RadioGroup rgTipo;
    private String sTipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_livro);

        edtTitulo = (EditText) findViewById(R.id.edtTitulo);
        edtID = (EditText) findViewById(R.id.edtID);
        rgTipo = (RadioGroup) findViewById(R.id.rgTipo);

        it = getIntent();
        edtID.setText(it.getStringExtra("liv_id"));
        edtTitulo.setText(it.getStringExtra("liv_tit"));
        if (it.getStringExtra("liv_tip").equals("P")) {
            rgTipo.check(R.id.rdPapel);
        } else {
            rgTipo.check(R.id.rdEbook);
        }
    }

    public void excluirClick(View v) {
        ManipulaBD bd2 = new ManipulaBD(this);
        livro.setId(Integer.parseInt(edtID.getText().toString()));
        bd2.deletar(livro);
        Toast.makeText(this, "Livro deletado com sucesso", Toast.LENGTH_SHORT).show();
        finish();
    }

    public void gravarClick(View v) {
        livro.setId(Integer.parseInt(edtID.getText().toString()));
        livro.setTitulo(edtTitulo.getText().toString());
        int tipo = rgTipo.getCheckedRadioButtonId();
        switch (tipo) {
            case R.id.rdPapel:
                sTipo = "P";
                break;

            case R.id.rdEbook:
                sTipo = "E";
                break;
        }
        livro.setTipo(sTipo);
        ManipulaBD bd = new ManipulaBD(this);
        bd.atualizar(livro);
        Toast.makeText(this, "Livro atualizado com sucesso", Toast.LENGTH_SHORT).show();
        //edtTitulo.setText("");
        finish();
    }

}
