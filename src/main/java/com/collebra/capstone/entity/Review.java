package com.collebra.capstone.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Value;

@Data
@Builder
@Entity(name = "Review")
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "REVIEW_ID")
	private Integer id;

	@Column(name = "DATE_POSTED")
	private LocalDateTime datePosted;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "RATING")
	private Integer rating;

	@ManyToOne
	@JoinColumn(name="MOVIE_ID")
	private Movies movie;


}
