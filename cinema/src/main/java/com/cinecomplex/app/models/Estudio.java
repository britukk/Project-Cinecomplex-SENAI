package com.cinecomplex.app.models;

import java.util.List;

public class Estudio {
    private Integer idEstudio;
    private String nome;

    private List<Filmes> filmes;

    public Estudio(){

    }


    public Integer getIdEstudio() {
        return this.idEstudio;
    }

    public void setIdEstudio(Integer idEstudio) {
        this.idEstudio = idEstudio;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Filmes> getFilmes() {
        return this.filmes;
    }

    public void setFilmes(List<Filmes> filmes) {
        this.filmes = filmes;
    }

}