package com.fatecrl.persistenciadadossqlite;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CadLivroActivity extends Activity {
    private Livro livro = new Livro();
    private EditText edtTitulo;
    private RadioGroup rgTipo;
    private String sTipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_livro);
        edtTitulo = (EditText) findViewById(R.id.edtTitulo);
        rgTipo = (RadioGroup) findViewById(R.id.rgTipo);
    }

    public void gravarClick(View v) {
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
        bd.inserir(livro);
        Toast.makeText(this, "Livro cadastrado com sucesso", Toast.LENGTH_SHORT).show();
        edtTitulo.setText("");
    }

    public void cancelarClick(View v) {
        finish();
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onMenuItemSelected(int panel, MenuItem item) {
        Intent it;
        switch (item.getItemId()) {
            case R.id.novoLivro:
                //Toast.makeText(this,"novo livro",Toast.LENGHT_SHORT).show();
                it = new Intent(this, CadLivroActivity.class);
                startActivity(it);
                break;
            case R.id.listarLivros:
                //Toast.makeText(this,"Listar livros",Toast.LENGHT_SHORT).show();
                it = new Intent(this, ListarLivrosActivity.class);
                startActivity(it);
                break;

        }
        return true;
    }
}
