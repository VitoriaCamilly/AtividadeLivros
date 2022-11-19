package com.example.atividadelivros;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DetalhesLivro extends AppCompatActivity {
    FloatingActionButton voltar;
    MainActivity mainActivity;
    TextView nomeLivro;
    TextView sinopseLivro;
    TextView precoLivro;
    LivroPadrao livroPadrao;
    int pos = 0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalhes);

        Intent intent = getIntent();
        pos = intent.getIntExtra("livro", 0);

        voltar = findViewById(R.id.voltar2);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        this.updateLabel();
    }

    private void updateLabel() {
        LivroPadrao  livro = MainActivity.listaLivros.get(this.pos);

        nomeLivro = findViewById(R.id.nomeLivro2);
        nomeLivro.setText(livro.getNomeLivro());

        sinopseLivro = findViewById(R.id.sinopseLivro2);
        sinopseLivro.setText(livro.getSinopseLivro());

        precoLivro = findViewById(R.id.precoLivro2);
        precoLivro.setText(livro.getPrecoLivro());
    }

}
