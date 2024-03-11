package com.mycompany.dvdstor;

import com.mycompany.dvdstor.controller.MovieController;


/**
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MovieController movieController = new MovieController();
        movieController.addUsingConsole();
    }
}
