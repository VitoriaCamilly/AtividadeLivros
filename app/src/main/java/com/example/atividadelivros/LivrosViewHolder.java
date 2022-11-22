package com.example.atividadelivros;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class LivrosViewHolder extends RecyclerView.ViewHolder {
    TextView nomeLivro, sinopseLivro, precoLivro;
    ImageView fotoLivro;
    ConstraintLayout quadrado;

    public LivrosViewHolder(@NonNull View itemView) {
        super(itemView);
        nomeLivro = itemView.findViewById(R.id.nomeLivro2);
        sinopseLivro = itemView.findViewById(R.id.sinopseLivro2);
        precoLivro = itemView.findViewById(R.id.precoLivro2);
        fotoLivro = itemView.findViewById(R.id.fotoLivro);
        quadrado = itemView.findViewById(R.id.quadrado);
    }
}
