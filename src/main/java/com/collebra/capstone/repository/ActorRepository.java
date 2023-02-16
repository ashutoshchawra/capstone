package com.collebra.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collebra.capstone.entity.Actors;

@Repository
public interface ActorRepository extends JpaRepository<Actors, Integer>{

}
