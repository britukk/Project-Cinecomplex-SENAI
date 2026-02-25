package com.cinecomplex.app.models;

import java.util.List;

public class Genero {
    private Integer idGenero;
    private String nome;

    private List <Filmes> filmes;

    public Genero(){

    }


    public Integer getIdGenero() {
        return this.idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
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