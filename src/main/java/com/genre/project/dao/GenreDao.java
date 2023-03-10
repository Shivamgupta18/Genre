package com.genre.project.dao;

import java.util.List;

import com.genre.project.model.Genre;

public interface GenreDao {
 
List<Genre>	getAllGenre();
   Genre getGenreById(Long id);
}
