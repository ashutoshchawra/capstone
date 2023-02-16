package com.collebra.capstone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity(name = "MovieActors")
@Data
public class MovieActors {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MOVIE__ACTOR_ID")
	private Integer movieActorId;

	@ManyToOne
	@JoinColumn(name = "MOVIE_ID")
	private Movies movie;

	@ManyToOne
	@JoinColumn(name = "ACTOR_ID")
	private Actors actors;

}
