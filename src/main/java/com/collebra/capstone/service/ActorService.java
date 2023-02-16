package com.collebra.capstone.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.collebra.capstone.entity.Actors;

public interface ActorService {

	public List<Actors> getActor();

	public Actors saveActor(Actors actor);

	public HttpStatus delete(Integer id);
}
