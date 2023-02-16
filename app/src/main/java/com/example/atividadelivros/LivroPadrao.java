package com.example.atividadelivros;

import android.net.Uri;

public class LivroPadrao {
    private String nomeLivro;
    private String sinopseLivro;
    private String precoLivro;
    private Uri imagem;

    public LivroPadrao(String nomeLivro, String sinopseLivro, String precoLivro, Uri imagem) {
        this.nomeLivro = nomeLivro;
        this.sinopseLivro = sinopseLivro;
        this.precoLivro = precoLivro;
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "LivroPadrao{" +
                "nomeLivro='" + nomeLivro + '\'' +
                ", sinopseLivro='" + sinopseLivro + '\'' +
                ", precoLivro='" + precoLivro + '\'' +
                ", imagem=" + imagem +
                '}';
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getSinopseLivro() {
        return sinopseLivro;
    }

    public void setSinopseLivro(String sinopseLivro) {
        this.sinopseLivro = sinopseLivro;
    }

    public String getPrecoLivro() {
        return precoLivro;
    }

    public void setPrecoLivro(String precoLivro) {
        this.precoLivro = precoLivro;
    }

    public Uri getImagem() {
        return imagem;
    }

    public void setImagem(Uri imagem) {
        this.imagem = imagem;
    }
}
