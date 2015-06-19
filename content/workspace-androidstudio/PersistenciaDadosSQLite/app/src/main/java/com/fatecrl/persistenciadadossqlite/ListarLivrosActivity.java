package com.fatecrl.persistenciadadossqlite;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListarLivrosActivity extends ListActivity {
    String regLivro;
    List<Livro> listLivros;
    ArrayList<String> arrlLivro;
    ManipulaBD db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        arrlLivro = new ArrayList<String>();
        db = new ManipulaBD(this);
        listLivros = db.buscar();
        for (Livro lv : listLivros) {
            regLivro = lv.getId() + " " + lv.getTitulo() + " " + lv.getTipo();
            arrlLivro.add(regLivro);
        }
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrlLivro);
        this.setListAdapter(dataAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Toast.makeText(this, "Registro selecionado: " + (position + 1), Toast.LENGTH_SHORT).show();
        Intent it = new Intent(this, EditLivroActivity.class);

        String liv_tit = listLivros.get(position).getTitulo();
        String liv_tip = listLivros.get(position).getTipo();
        String liv_id = "" + listLivros.get(position).getId();
        it.putExtra("liv_tit", liv_tit);
        it.putExtra("liv_tip", liv_tip);
        it.putExtra("liv_id", liv_id);
        startActivity(it);
        finish(); // finish a lista de livros pq ele nao precisa mais ver a lista com resultado antigos (n�o atualiza a lista automaticamnete)
    }

}
