package com.cinecomplex.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.cinecomplex.app.models.Filmes;

public interface FilmesRepository extends CrudRepository<Filmes, Integer> {

}

// ainda tenho que ver se a gente precisa disso, peguei do código dos eventos que fizemos