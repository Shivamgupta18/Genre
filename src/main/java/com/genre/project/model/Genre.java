package com.genre.project.model;

import java.util.ArrayList;
import java.util.List;

public class Genre {
	private Long id;
	private String name;

	List<Movie> movie = new ArrayList<>();

	public Genre(Long id, String name, List<Movie> movie) {
		super();
		this.id = id;
		this.name = name;
		this.movie = movie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Movie> getMovie() {
		return movie;
	}

	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}

	public Genre() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Genre [id=" + id + ", name=" + name + ", movie=" + movie + "]";
	}

	 
}
