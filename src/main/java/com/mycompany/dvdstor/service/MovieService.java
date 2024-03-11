package com.mycompany.dvdstor.service;

import com.mycompany.dvdstor.entity.Movie;
import com.mycompany.dvdstor.repository.GoLiveMovieRepository;

public class MovieService {

    private GoLiveMovieRepository movieRepository = new GoLiveMovieRepository();

    public void registerMovie(Movie movie) {
        movieRepository.add(movie);

    }
}
