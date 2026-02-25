package com.cinecomplex.app.models;

import java.time.LocalDate;
import java.util.List;

public class Pessoa {
private Integer idPessoa;
private String nome;
private LocalDate dataNascimento;

private List<Filmes> filmes;

public Pessoa(){

}


    public Integer getIdPessoa() {
        return this.idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Filmes> getFilmes() {
        return this.filmes;
    }

    public void setFilmes(List<Filmes> filmes) {
        this.filmes = filmes;
    }

}