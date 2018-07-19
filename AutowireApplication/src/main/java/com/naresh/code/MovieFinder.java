package com.naresh.code;

import java.util.ArrayList;
import java.util.List;

public class MovieFinder
{
	private static List<Movie> movieList;
	static {
		movieList=new ArrayList<Movie>();
		movieList.add(new Movie(2018,"RX100"));
		movieList.add(new Movie(2018,"BharathAneNenu"));
		movieList.add(new Movie(2017,"ArjunReddy"));
		movieList.add(new Movie(2017,"Bhahubali"));
		
	}
	public List<Movie> findeMovieByYear(int year)
	{
		List<Movie> foundList=new ArrayList<Movie>();
		for(Movie movie:movieList)
		{
			if(movie.getYear()==year)
			{
				foundList.add(movie);
			}
		}
		return foundList;
	}
}
