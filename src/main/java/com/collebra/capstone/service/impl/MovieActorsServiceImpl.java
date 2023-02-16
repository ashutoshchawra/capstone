package com.collebra.capstone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.collebra.capstone.entity.MovieActors;
import com.collebra.capstone.repository.MovieActorsRepository;
import com.collebra.capstone.service.MovieActorsService;

@Service
public class MovieActorsServiceImpl implements MovieActorsService{
	
	@Autowired
	private MovieActorsRepository movieactorsRepository;

	public List<MovieActors> getMovieActors() {
		System.out.println(movieactorsRepository.findAll());
		return movieactorsRepository.findAll();
	}

	@Override
	public MovieActors saveMovieActors(MovieActors m) {
		return movieactorsRepository.save(m);
	}

	@Override
	public HttpStatus delete(Integer id) {
		movieactorsRepository.deleteById(id);
		return HttpStatus.ACCEPTED;
	}

}
