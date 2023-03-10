package com.genre.project.service;

import java.util.List;

import com.genre.project.model.Genre;

public interface GenreService {
	List<Genre>	getAllGenre();
	   Genre getGenreById(Long id);
}
