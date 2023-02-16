package com.collebra.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collebra.capstone.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>{

}
