package com.tdd.pratices._1srp.solution;

import com.tdd.pratices._1srp.Movie;
import com.tdd.pratices._1srp.MoviesRepository;

import java.util.List;

public class MovieRecommendations {

    private MoviesRepository moviesRepository;

    public MovieRecommendations(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    public List<Movie> getRecommendations(String gender){
        return moviesRepository.findByGender(gender);
    }

}
