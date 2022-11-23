package com.example.atividadelivros;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class FotoViewHolder extends RecyclerView.ViewHolder {
    ImageView selecionaFotoLivro;
    ConstraintLayout quadradoFoto;

    public FotoViewHolder(@NonNull View itemView) {
        super(itemView);
        selecionaFotoLivro = itemView.findViewById(R.id.selecionaFotoLivro);
        quadradoFoto  = itemView.findViewById(R.id.quadradoFoto);
    }
}
