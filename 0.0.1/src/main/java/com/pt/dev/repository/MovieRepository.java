package com.pt.dev.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.pt.dev.domain.Movie;
@RepositoryRestResource(collectionResourceRel = "movie", path = "movie")
public interface MovieRepository extends CrudRepository<Movie, Long>{

}
