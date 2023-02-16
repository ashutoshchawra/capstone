package com.collebra.capstone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.collebra.capstone.entity.Review;
import com.collebra.capstone.repository.ReviewRepository;
import com.collebra.capstone.service.ReviewService;

@Service
public class ReviewServiceImpl implements ReviewService{
	
	@Autowired
	private ReviewRepository reviewRepository;

	public List<Review> getReview() {
		System.out.println(reviewRepository.findAll());
		return reviewRepository.findAll();
	}

	@Override
	public Review saveReview(Review m) {
		return reviewRepository.save(m);
	}

	@Override
	public HttpStatus delete(Integer id) {
		reviewRepository.deleteById(id);
		return HttpStatus.ACCEPTED;
	}

}
