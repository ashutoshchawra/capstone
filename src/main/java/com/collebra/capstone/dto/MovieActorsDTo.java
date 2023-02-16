package com.collebra.capstone.dto;

import com.collebra.capstone.entity.Actors;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Value;


@Getter
@Value
@Builder
public class MovieActorsDTo {

	private MoviesDTO movie;
	private Actors actors;


}
