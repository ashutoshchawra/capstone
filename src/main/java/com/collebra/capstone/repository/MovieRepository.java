package com.collebra.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collebra.capstone.entity.Movies;

@Repository
public interface MovieRepository extends JpaRepository<Movies, Integer>{

	
}
