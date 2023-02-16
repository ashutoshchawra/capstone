package com.collebra.capstone.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MoviesDTO {

	private String movieTitle;
	private Integer movieCost;
	private Integer year;

}
