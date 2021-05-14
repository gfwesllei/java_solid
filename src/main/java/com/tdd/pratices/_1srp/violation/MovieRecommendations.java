package com.tdd.pratices._1srp.violation;

import com.tdd.pratices._1srp.Movie;
import com.tdd.pratices._1srp.MoviesRepository;

import java.util.List;
import java.util.stream.Collectors;

public class MovieRecommendations {

    private MoviesRepository moviesRepository;

    public MovieRecommendations(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    public List<Movie> getRecommendations(String gender){
        return moviesRepository.findByGender(gender);
    }

    public String exportMoviesToCsv(String gender){
        List<Movie> movies = getRecommendations(gender);
        return movies.stream().map(movie->movie.getTitle()+","+movie.getGender()+","+movie.getAuthor()).collect(Collectors.joining("\n"));
    }
}
