package com.collebra.capstone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Value;

@Data
@Builder
@Entity(name = "Actors")
public class Actors {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ACTOR_ID")
	private Integer id;

	@Column(name = "FIRST_NAME")
	private String fisrtName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "GENDER")
	private Character gender;

	@Column(name = "AGE")
	private Integer age;

}
