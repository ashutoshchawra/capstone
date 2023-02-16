package com.collebra.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collebra.capstone.entity.MovieActors;

@Repository
public interface MovieActorsRepository extends JpaRepository<MovieActors, Integer>{

}
