package com.example.atividadelivros;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LivrosViewHolder extends RecyclerView.ViewHolder {
    TextView nomeLivro, sinopseLivro, precoLivro;

    public LivrosViewHolder(@NonNull View itemView) {
        super(itemView);
        nomeLivro = itemView.findViewById(R.id.nomeLivro);
        sinopseLivro = itemView.findViewById(R.id.sinopseLivro);
        precoLivro = itemView.findViewById(R.id.precoLivro);
    }
}
