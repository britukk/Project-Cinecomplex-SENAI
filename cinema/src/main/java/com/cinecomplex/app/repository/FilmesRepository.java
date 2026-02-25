package com.cinecomplex.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.cinecomplex.app.models.Filmes;

public interface FilmesRepository extends CrudRepository<Filmes, Integer> {

}

// colocar na classe filmes depois:

//@Entity
//@Table(name = "filmes") // Nome da tabela no banco de dados
//public class Filmes {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;

