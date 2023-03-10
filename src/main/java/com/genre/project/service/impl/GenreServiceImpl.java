package com.genre.project.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.genre.project.dao.GenreDao;
import com.genre.project.model.Genre;
import com.genre.project.service.GenreService;
@Service
public class GenreServiceImpl implements GenreService {

	private GenreDao genredao;
	@Override
	public List<Genre> getAllGenre() {
		// TODO Auto-generated method stub
		return genredao.getAllGenre();
	}

	@Override
	public Genre getGenreById(Long id) {
		// TODO Auto-generated method stub
		return genredao.getGenreById(id);
	}

}
