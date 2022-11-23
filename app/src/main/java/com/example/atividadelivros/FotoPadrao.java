package com.example.atividadelivros;

import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class FotoPadrao {
    private int imagem;
    private ConstraintLayout quadradoFoto;

    @Override
    public String toString() {
        return "FotoPadrao{" +
                "imagem=" + imagem +
                ", quadradoFoto=" + quadradoFoto +
                '}';
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public ConstraintLayout getQuadradoFoto() {
        return quadradoFoto;
    }

    public void setQuadradoFoto(ConstraintLayout quadradoFoto) {
        this.quadradoFoto = quadradoFoto;
    }

    public FotoPadrao(int imagem, ConstraintLayout quadradoFoto) {
        this.imagem = imagem;
        this.quadradoFoto = quadradoFoto;
    }
}
