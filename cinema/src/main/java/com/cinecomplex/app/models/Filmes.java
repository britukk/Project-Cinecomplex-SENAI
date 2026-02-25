package com.cinecomplex.app.models;

import java.time.LocalDate;
import java.util.List;

public class Filmes {

    private Integer idFilmes;
    private int duracao;
    private LocalDate dataLancamento;
    private String titulo;
    private String sinopse;
    private String idioma;

    private CategoriaIdade categoriaIdade;
    private Estudio estudio;
    private List<Genero> generos;
    private List<Pessoa> pessoas;
    private List<Avaliacao> avaliacoes;

    public Filmes(){
        
    }

    public int getIdFilmes() {
        return this.idFilmes;
    }

    public void setIdFilmes(int idFilmes) {
        this.idFilmes = idFilmes;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public LocalDate getDataLancamento() {
        return this.dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return this.sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getIdioma() {
        return this.idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public CategoriaIdade getCategoriaIdade() {
        return this.categoriaIdade;
    }

    public void setCategoriaIdade(CategoriaIdade categoriaIdade) {
        this.categoriaIdade = categoriaIdade;
    }

    public Estudio getEstudio() {
        return this.estudio;
    }

    public void setEstudio(Estudio estudio) {
        this.estudio = estudio;
    }

    public List<Genero> getGeneros() {
        return this.generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    public List<Pessoa> getPessoas() {
        return this.pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public List<Avaliacao> getAvaliacoes() {
        return this.avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

}