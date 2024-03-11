package com.mycompany.dvdstor.controller;

import com.mycompany.dvdstor.entity.Movie;
import com.mycompany.dvdstor.service.MovieService;

import java.util.Scanner;

public class MovieController {

    private MovieService movieService = new MovieService();

    public void addUsingConsole() {
        System.out.println("What is the movie title ?");
        Scanner sc=new Scanner(System.in);
        String movieTitle = sc.nextLine();
        System.out.println("What is the movie genre?");
        String movieGenre=sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(movieTitle);
        movie.setGenre(movieGenre);
        movieService.registerMovie(movie);

    }
}
