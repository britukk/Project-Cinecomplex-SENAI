package com.cinecomplex.app.models;

public class CategoriaIdade {
    private Integer idCategoriaIdade;
    private String codigo;
    private String descricao;

    private Filmes filmes;

    public CategoriaIdade(){

    }

    public Integer getIdCategoriaIdade() {
        return this.idCategoriaIdade;
    }

    public void setIdCategoriaIdade(Integer idCategoriaIdade) {
        this.idCategoriaIdade = idCategoriaIdade;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Filmes getFilme() {
        return this.filmes;
    }

    public void setFilme(Filmes filmes) {
        this.filmes = filmes;
    }

}