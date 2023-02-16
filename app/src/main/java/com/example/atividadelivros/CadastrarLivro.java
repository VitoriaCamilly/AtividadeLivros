package com.example.atividadelivros;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
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
    Button addImage;

    private RecyclerView recycler;
    public static final int PICK_IMAGE = 1;
    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrarlivro);

        recycler = findViewById(R.id.recyclerView);
        adicionarLista = findViewById(R.id.adicionarLista);
        addImage = findViewById(R.id.addImagem);
        addImage.setOnClickListener(
                v -> {
                    pickImage();
                }
        );

        adicionarLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNome = findViewById(R.id.inputNome);
                inputSinopse = findViewById(R.id.inputSinopse);
                inputPreco = findViewById(R.id.inputPreco);
                LivroPadrao livroPadrao = new LivroPadrao(inputNome.getText().toString(), inputSinopse.getText().toString(), inputPreco.getText().toString(), uri);
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + livroPadrao);
                MainActivity.listaLivros.add(livroPadrao);
                System.out.println("Livro Cadastrado");

//                setResult(200, new Intent());
                finish();
            }
        });



        voltar = findViewById(R.id.voltar2);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(i);
                finish();
            }
        });
    }

    public void pickImage() {
        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery, 3);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && data != null) {
            Uri selectedImagem = data.getData();
            uri =selectedImagem;
            ImageView imageView = findViewById(R.id.imageView);
            imageView.setImageURI(selectedImagem);
        }else{
            System.out.println("oi");
        }
    }
}