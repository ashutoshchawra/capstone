package com.collebra.capstone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.collebra.capstone.entity.Actors;
import com.collebra.capstone.repository.ActorRepository;
import com.collebra.capstone.service.ActorService;

@Service
public class ActorServiceImpl implements ActorService {

	@Autowired
	private ActorRepository actorRepository;

	public List<Actors> getActor() {
		System.out.println(actorRepository.findAll());
		return actorRepository.findAll();
	}

	@Override
	public Actors saveActor(Actors m) {
		return actorRepository.save(m);
	}

	@Override
	public HttpStatus delete(Integer id) {
		actorRepository.deleteById(id);
		return HttpStatus.ACCEPTED;
	}
}
