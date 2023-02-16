package com.collebra.capstone.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.collebra.capstone.entity.Movies;

public interface MovieService {

	public List<Movies> getMovie();

	public Movies saveMovie(Movies movie);

	public HttpStatus delete(Integer id);
}
