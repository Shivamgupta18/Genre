package com.genre.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genre.project.model.Genre;
import com.genre.project.service.GenreService;

@RestController
@RequestMapping("/genre")
public class GenreController {
	
	@Autowired
	private GenreService genreservice;
	
	@GetMapping("/all")
   public List<Genre> getAllGenre(){
		return genreservice.getAllGenre();
	}
	
	@GetMapping("/{id}")
	public Genre getGenreById(@PathVariable Long id) {
		return genreservice.getGenreById(id);
	}

}
