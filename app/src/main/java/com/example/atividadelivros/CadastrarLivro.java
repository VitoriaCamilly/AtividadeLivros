package com.example.atividadelivros;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class CadastrarLivro extends AppCompatActivity {
    FloatingActionButton voltar;
    FloatingActionButton adicionarLista;
    private EditText inputNome;
    private EditText inputSinopse;
    private EditText inputPreco;
    private int fotoLivro;

    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrarlivro);

        recycler = findViewById(R.id.recyclerView);
        adicionarLista = findViewById(R.id.adicionarLista);

        adicionarLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNome = findViewById(R.id.inputNome);
                inputSinopse = findViewById(R.id.inputSinopse);
                inputPreco = findViewById(R.id.inputPreco);

                LivroPadrao livroPadrao = new LivroPadrao(inputNome.getText().toString(), inputSinopse.getText().toString(), inputPreco.getText().toString(), 2131165343);
                MainActivity.listaLivros.add(livroPadrao);
                System.out.println("Livro Cadastrado");
            }
        });



        voltar = findViewById(R.id.voltar2);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}