package com.tdd.pratices._1srp;

import com.tdd.pratices._1srp.solution.MovieRecommendations;
import com.tdd.pratices._1srp.solution.MoviesCsvExport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class MovieRecommendationsTest {

    public static final String ACTION = "Action";
    @Mock
    MoviesRepository moviesRepository;

    @InjectMocks
    MovieRecommendations movieRecommendations;

    private static String GENDER_ACTION="Action";

    @BeforeEach
    void setup(){

        MockitoAnnotations.openMocks(this);
        movieRecommendations = new MovieRecommendations(moviesRepository);
    }

    @Test
    void getRecommendations() {

        Mockito.when(movieRecommendations.getRecommendations(GENDER_ACTION)).thenReturn(
                Arrays.asList(new Movie("ET","Action","Mel Ginson"),new Movie("Karate Kid","Action","Roy Nelson"))
        );

        List<Movie> movies = movieRecommendations.getRecommendations("Action");
        assertThat(movies).hasSize(2);
    }

    @Test
    void exportMoviesToCsv() {

        Mockito.when(movieRecommendations.getRecommendations(GENDER_ACTION)).thenReturn(
                Collections.singletonList(new Movie("ET","Action","Mel Ginson"))
        );
        List<Movie> movies = movieRecommendations.getRecommendations(ACTION);
        String scv = new MoviesCsvExport().exportMoviesToCsv(movies);
        assertThat(scv).isEqualTo("ET,Action,Mel Ginson");
    }
}