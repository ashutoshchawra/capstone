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

import com.collebra.capstone.entity.Actors;
import com.collebra.capstone.service.ActorService;

@RestController
public class ActorController {
	
	@Autowired
	private ActorService actorService;
	
	@GetMapping("/getactor")
	public List<Actors> getActor() {
		System.out.print(actorService.getActor().toString());
		return actorService.getActor();
	}

	@PostMapping("/saveactor")
	public HttpStatus saveActor(@RequestBody Actors actors) {
		actorService.saveActor(actors);
		return HttpStatus.CREATED;
	}

	@PutMapping("/updateactor")
	public HttpStatus updateActor(@RequestBody Actors actors) {
		actorService.saveActor(actors);
		return HttpStatus.CREATED;
	}

	@DeleteMapping("/deleteactor/{id}")
	public HttpStatus deleteActor(@PathVariable("id") Integer id) {
		actorService.delete(id);
		return HttpStatus.CREATED;
	}

}
