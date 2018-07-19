package com.naresh.code;

import java.util.List;

public class MovieLister 
{
	private int year;
	private MovieFinder finder;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public MovieFinder getFinder() {
		return finder;
	}
	public void setFinder(MovieFinder finder) {
		this.finder = finder;
	}
	public void printMovieByYear()
	{
		List<Movie> found=finder.findeMovieByYear(year);
		for(Movie movie:found)
		{
			System.out.println(movie);
		}
	}
}
