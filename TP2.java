package com.example.uapv1602471.tp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TP2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp2);

        Livre livre1 = new Livre("Guerre et paix", "L.Tolstoï");
        Livre livre2 = new Livre("Fondation", "I.Asimov");
        Livre livre3 = new Livre("Histoire de Babar, le petit éléphant", "J. de Brunhoff");
        Livre livre4 = new Livre("Le Grand Pouvoir de Chinke!", "J.Van Hamme et G.Rosinski");
        Livre livre5 = new Livre("Monster", "N.Ursawa");
        Livre livre6 = new Livre("V pour Vendetta", "A.Moore et D.Lloyd ");
        Livre livre7 = new Livre("Le comte de Monte-Cristo", "A.Durres");
        Livre livre8 = new Livre("Astérix chez les Bretons", "R.Goscinny et A.Uderzo");
        Livre livre9 = new Livre("Du côté de chez Swan", "M.Proust");

        Livre[] livres;
        livres = new Livre[9];

        livres[0] = livre1;
        livres[1] = livre2;
        livres[2] = livre3;
        livres[3] = livre4;
        livres[4] = livre5;
        livres[5] = livre6;
        livres[6] = livre7;
        livres[7] = livre8;
        livres[8] = livre9;

        final ListView listview = (ListView) findViewById(R.id.listview);

        final ArrayList<String> items = new ArrayList<String>();
        for (int i = 0; i<livres.length; i++) {
            String contenu = livres[i].getTitre() + System.getProperty("line.separator") + livres[i].getAuteur();
            items.add(contenu);
        }

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listview.setAdapter(adapter);

    }
}
