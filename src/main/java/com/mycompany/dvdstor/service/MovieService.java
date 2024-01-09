package com.mycompany.dvdstor.service;

import com.mycompany.dvdstor.entity.Movie;
import com.mycompany.dvdstor.repository.MovieRepository;

public class MovieService {

    private MovieRepository movieRepository = new MovieRepository();

    public void registerMovie(Movie movie) {
        movieRepository.add(movie);

    }
}
