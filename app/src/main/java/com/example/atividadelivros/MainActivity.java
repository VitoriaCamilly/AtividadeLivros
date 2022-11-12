package com.example.atividadelivros;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private LivrosAdapter adapter;
    private ArrayList<LivroPadrao> listaLivros;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler = findViewById(R.id.recyclerView);
        listaLivros = new ArrayList<>();
        listaLivros.add(new LivroPadrao("Diario de um banana", "Um banana", "R$20,00"));
        listaLivros.add(new LivroPadrao("Diario de um banana 2", "Um banana", "R$20,00"));
        listaLivros.add(new LivroPadrao("Diario de um banana 3", "Um banana", "R$20,00"));
        listaLivros.add(new LivroPadrao("Diario de um banana", "Um banana", "R$20,00"));
        listaLivros.add(new LivroPadrao("Diario de um banana 2", "Um banana", "R$20,00"));
        listaLivros.add(new LivroPadrao("Diario de um banana 3", "Um banana", "R$20,00"));
        listaLivros.add(new LivroPadrao("Diario de um banana", "Um banana", "R$20,00"));
        listaLivros.add(new LivroPadrao("Diario de um banana 2", "Um banana", "R$20,00"));
        listaLivros.add(new LivroPadrao("Diario de um banana 3", "Um banana", "R$20,00"));
        adapter = new LivrosAdapter(MainActivity.this, listaLivros);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
                MainActivity.this, LinearLayoutManager.VERTICAL, false);
        recycler.setLayoutManager(layoutManager);
        recycler.setItemAnimator(new DefaultItemAnimator());
        recycler.setAdapter(adapter);

        botao = findViewById(R.id.botao);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CadastrarLivro.class);
                startActivity(i);
            }
        });
    }

}