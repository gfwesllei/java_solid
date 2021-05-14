package com.tdd.pratices._1srp.solution;

import com.tdd.pratices._1srp.Movie;

import java.util.List;
import java.util.stream.Collectors;

public class MoviesCsvExport {

    public String exportMoviesToCsv(List<Movie> movies){
        return movies.stream().map(movie->movie.getTitle()+","+movie.getGender()+","+movie.getAuthor()).collect(Collectors.joining("\n"));
    }
}
