package chiara.tp2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;

public class Sobre extends ListActivity {
    private String opcoes[] = {
            "Mostrar Browser", // 0
            "Mostrar Mapa", // 1
            "Mostrar Caminho", // 2
            "Discar e Chamar no Telefone", // 3
            "Pesquisar no Google", // 4
            "Market", // 5
            "Email", // 6
            "SMS", // 7
            "Sair", // 8
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        // Listar opções na tela (como se fosse uma activity)
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opcoes);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        switch (position){
            case 0:
                Toast.makeText(this, "Mostrar Browser", Toast.LENGTH_LONG).show();
                Intent it = new Intent(this, Browser.class);
                startActivity(it);
                break;
            case 1:
                Toast.makeText(this, "Mostrar Mapa", Toast.LENGTH_LONG).show();
                it = new Intent(this, Mapa.class);
                startActivity(it);
                break;
            case 2:
                Toast.makeText(this, "Mostrar Caminho", Toast.LENGTH_LONG).show();
                it = new Intent(this, Caminho.class);
                startActivity(it);
                break;
            case 3:
                Toast.makeText(this, "Discar e Chamar no Telefone", Toast.LENGTH_LONG).show();
                it = new Intent(this, Telefone.class);
                startActivity(it);
                break;
            case 4:
                Toast.makeText(this, "Pesquisar no Google", Toast.LENGTH_LONG).show();
                it = new Intent(this, Google.class);
                startActivity(it);
                break;
            case 5:
                Toast.makeText(this, "Market", Toast.LENGTH_LONG).show();
                it = new Intent(this, Market.class);
                startActivity(it);
                break;
            case 6:
                Toast.makeText(this, "Email", Toast.LENGTH_LONG).show();
                it = new Intent(this, Email.class);
                startActivity(it);
                break;
            case 7:
                Toast.makeText(this, "SMS", Toast.LENGTH_LONG).show();
                it = new Intent(this, SMS.class);
                startActivity(it);
                break;
            case 8:
                Toast.makeText(this, "Sair", Toast.LENGTH_LONG).show();
                finish();
                System.exit(0);
                break;
        }
    }
}