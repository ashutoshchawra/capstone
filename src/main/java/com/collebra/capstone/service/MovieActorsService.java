package com.collebra.capstone.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.collebra.capstone.entity.MovieActors;

public interface MovieActorsService {

	public List<MovieActors> getMovieActors();

	public MovieActors saveMovieActors(MovieActors movieactors);

	public HttpStatus delete(Integer id);
}
