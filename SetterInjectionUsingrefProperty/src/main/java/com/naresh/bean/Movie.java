package com.naresh.bean;

public class Movie
{
	private   Director director;
	private String nextMovie;
	private String releaseDate;
	

	public void setDirector(Director director) {
		this.director = director;
	}

	public void setNextMovie(String nextMovie) {
		this.nextMovie = nextMovie;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	@Override
	public String toString() {
		return "Movie [director=" + director + ", nextMovie=" + nextMovie + ", releaseDate=" + releaseDate + "]";
	}

}
