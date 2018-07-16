package com.naresh.bean;

public class Movie 
{
	private String movieName;
	private int movieYear;
	private String movieDirector;
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getMovieYear() {
		return movieYear;
	}
	public void setMovieYear(int movieYear) {
		this.movieYear = movieYear;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", movieYear=" + movieYear + ", movieDirector=" + movieDirector + "]";
	}
	
	

}
