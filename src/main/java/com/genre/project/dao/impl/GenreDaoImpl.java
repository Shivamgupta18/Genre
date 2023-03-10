package com.genre.project.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.genre.project.dao.GenreDao;
import com.genre.project.model.Genre;

@Repository
public class GenreDaoImpl implements GenreDao {
	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public List<Genre> getAllGenre() {
		// TODO Auto-generated method stub
		return jdbctemplate.query(" select * from Genre", BeanPropertyRowMapper.newInstance(Genre.class));
	}

	@Override
	public Genre getGenreById(Long id) {
		// TODO Auto-generated method stub
		return jdbctemplate.queryForObject("select * from Genre where id=? ",
				BeanPropertyRowMapper.newInstance(Genre.class),id);
	}

}
