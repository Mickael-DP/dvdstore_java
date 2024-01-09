package com.mycompany.dvdstor;

import com.mycompany.dvdstor.entity.Movie;
import com.mycompany.dvdstor.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Demander a l'utilisateur de saisir le titre et le genre d'un film

        System.out.println("What is the movie title ?");
        Scanner sc = new Scanner(System.in);
        String movieTitle = sc.nextLine();
        System.out.println("What is the movie genre ?");
        String movieGenre = sc.nextLine();

        // Instancier un film en lui affectant le titre et le genre

        Movie movie = new Movie();
        movie.setTitle(movieTitle);
        movie.setGenre(movieGenre);

        // Instancier MovieService

        MovieService movieService = new MovieService();

        // Executer la méthode registerMovie

        movieService.registerMovie(movie);

    }
}
