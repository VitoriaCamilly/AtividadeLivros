package com.example.atividadelivros;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FotoAdapter extends RecyclerView.Adapter<FotoViewHolder> {
    private Context context;
    private ArrayList<FotoPadrao> listaFotos;

    public FotoAdapter(Context context, ArrayList<FotoPadrao> listaFotos) {
        this.context = context;
        this.listaFotos = listaFotos; }

    @NonNull
    @Override
    public FotoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int typeView) {
        View view = LayoutInflater.from(context).inflate(R.layout.fotoslivro, parent, false);
        FotoViewHolder viewHolder = new FotoViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FotoViewHolder fotoViewHolder, int position) {
        FotoPadrao fotoPadrao = listaFotos.get(position);
        fotoViewHolder.selecionaFotoLivro.setImageResource(fotoPadrao.getImagem());
        fotoViewHolder.quadradoFoto.setOnClickListener(v -> {
            Intent intent = new Intent(context, CadastrarLivro.class);
            intent.putExtra("codigoFoto", fotoPadrao.getImagem());
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return listaFotos.size();
    }

}
