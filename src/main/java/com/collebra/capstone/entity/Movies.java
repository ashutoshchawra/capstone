package com.collebra.capstone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity(name="MOVIE")
@Data
public class Movies {

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		@Column(name = "MOVIE_ID")
		private Integer id;

		@Column(name = "MOVIE_TITLE")
		private String movieTitle;

		@Column(name = "MOVIE_COST")
		private Integer movieCost;

		@Column(name = "YEAR")
		private Integer year;

}
