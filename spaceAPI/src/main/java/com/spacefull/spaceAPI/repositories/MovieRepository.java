package com.spacefull.spaceAPI.repositories;

import com.spacefull.spaceAPI.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
