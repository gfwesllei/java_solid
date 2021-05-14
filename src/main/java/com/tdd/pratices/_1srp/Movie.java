package com.tdd.pratices._1srp;

import lombok.Data;

@Data
public class Movie {

    private String title;
    private String gender;
    private String author;

    public Movie(String title, String gender, String author) {
        this.title = title;
        this.gender = gender;
        this.author = author;
    }
}
