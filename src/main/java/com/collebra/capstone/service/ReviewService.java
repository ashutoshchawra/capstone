package com.collebra.capstone.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.collebra.capstone.entity.Review;

public interface ReviewService {

	public List<Review> getReview();

	public Review saveReview(Review review);

	public HttpStatus delete(Integer id);
}
