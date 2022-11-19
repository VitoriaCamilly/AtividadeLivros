package com.example.atividadelivros;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LivrosAdapter extends RecyclerView.Adapter<LivrosViewHolder> {
    private Context context;
    private ArrayList<LivroPadrao> listaLivros;

    public LivrosAdapter(Context context, ArrayList<LivroPadrao> listaLivros) {
        this.context = context;
        this.listaLivros = listaLivros;
    }

    @NonNull
    @Override
    public LivrosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int typeView) {
        View view = LayoutInflater.from(context).inflate(R.layout.livros, parent, false);
        LivrosViewHolder viewHolder = new LivrosViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LivrosViewHolder livrosViewHolder, int position) {
        LivroPadrao livroPadrao = listaLivros.get(position);
        livrosViewHolder.nomeLivro.setText(livroPadrao.getNomeLivro());
        livrosViewHolder.sinopseLivro.setText(livroPadrao.getSinopseLivro());
        livrosViewHolder.precoLivro.setText(livroPadrao.getPrecoLivro());

        livrosViewHolder.quadrado.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetalhesLivro.class);
            intent.putExtra("livro", position);
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return listaLivros.size();
    }

}
