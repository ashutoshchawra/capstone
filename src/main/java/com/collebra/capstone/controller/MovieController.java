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

import com.collebra.capstone.entity.Movies;
import com.collebra.capstone.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;

	@GetMapping("/getmovie")
	public List<Movies> getMovie() {
		System.out.print(movieService.getMovie().toString());
		return movieService.getMovie();
	}

	@PostMapping("/savemovie")
	public HttpStatus saveMovie(@RequestBody Movies movies) {
		movieService.saveMovie(movies);
		return HttpStatus.CREATED;
	}

	@PutMapping("/updatemovie")
	public HttpStatus updateMovie(@RequestBody Movies movies) {
		movieService.saveMovie(movies);
		return HttpStatus.CREATED;
	}

	@DeleteMapping("/deletemovie/{id}")
	public HttpStatus deleteMovie(@PathVariable("id") Integer id) {
		movieService.delete(id);
		return HttpStatus.CREATED;
	}
}
