package com.tdd.pratices._1srp;

import java.util.List;

public interface MoviesRepository {

    List<Movie> findByGender(String gender);
}
