package com.collebra.capstone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.collebra.capstone.entity.Review;
import com.collebra.capstone.service.ReviewService;

@RestController
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	@GetMapping("/getreview")
	public List<Review> getReview() {
		System.out.print(reviewService.getReview().toString());
		return reviewService.getReview();
	}

	@PostMapping("/savereview")
	public HttpStatus saveReview(@RequestBody Review review) {
		reviewService.saveReview(review);
		return HttpStatus.CREATED;
	}

	@PutMapping("/updatereview")
	public HttpStatus updateReview(@RequestBody Review review) {
		reviewService.saveReview(review);
		return HttpStatus.CREATED;
	}

	@DeleteMapping("/deletereview/{id}")
	public HttpStatus deleteReview(@PathVariable("id") Integer id) {
		reviewService.delete(id);
		return HttpStatus.CREATED;
	}

}
