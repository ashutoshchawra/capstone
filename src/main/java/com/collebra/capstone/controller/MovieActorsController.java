package com.collebra.capstone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.collebra.capstone.entity.MovieActors;
import com.collebra.capstone.service.MovieActorsService;

@CrossOrigin("http://localhost:8080")
@RestController
public class MovieActorsController {
	
	@Autowired
	private MovieActorsService movieactorsService;
	
	@GetMapping("/getmovieactors")
	public List<MovieActors> getMovieActors() {
		System.out.print(movieactorsService.getMovieActors().toString());
		return movieactorsService.getMovieActors();
	}

	@PostMapping("/savemovieactor")
	public HttpStatus saveMovieActors(@RequestBody MovieActors movieactors) {
		movieactorsService.saveMovieActors(movieactors);
		return HttpStatus.CREATED;
	}

	@PutMapping("/updatemovieactors")
	public HttpStatus updateMovieActors(@RequestBody MovieActors movieactors) {
		movieactorsService.saveMovieActors(movieactors);
		return HttpStatus.CREATED;
	}

	@DeleteMapping("/deletemovieactors/{id}")
	public HttpStatus deleteMovieActors(@PathVariable("id") Integer id) {
		movieactorsService.delete(id);
		return HttpStatus.CREATED;
	}

}
