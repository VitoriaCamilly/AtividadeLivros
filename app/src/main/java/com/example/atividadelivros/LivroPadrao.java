package com.example.atividadelivros;

public class LivroPadrao {
    private String nomeLivro;
    private String sinopseLivro;
    private String precoLivro;

    public LivroPadrao(String nomeLivro, String sinopseLivro, String precoLivro) {
        this.nomeLivro = nomeLivro;
        this.sinopseLivro = sinopseLivro;
        this.precoLivro = precoLivro;
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
}
