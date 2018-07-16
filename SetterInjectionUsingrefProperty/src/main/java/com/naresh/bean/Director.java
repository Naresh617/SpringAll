package com.naresh.bean;

public class Director 
{
	private String directorName;
	private int directorHitMovies;
	
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public void setDirectorHitMovies(int directorHitMovies) {
		this.directorHitMovies = directorHitMovies;
	}

	@Override
	public String toString() {
		return "Director [directorName=" + directorName + ", directorHitMovies=" + directorHitMovies + "]";
	}
	
	
}
