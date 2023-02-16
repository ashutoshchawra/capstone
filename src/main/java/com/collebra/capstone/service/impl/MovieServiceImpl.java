package com.collebra.capstone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.collebra.capstone.entity.Movies;
import com.collebra.capstone.repository.MovieRepository;
import com.collebra.capstone.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;

	public List<Movies> getMovie() {
		System.out.println(movieRepository.findAll());
		return movieRepository.findAll();
	}

	@Override
	public Movies saveMovie(Movies m) {
		return movieRepository.save(m);
	}

	@Override
	public HttpStatus delete(Integer id) {
		movieRepository.deleteById(id);
		return HttpStatus.ACCEPTED;
	}

}
