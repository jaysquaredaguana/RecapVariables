package com.netflix;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Netflix 2.0");

        // Store movie and streaming preferences
        String favoriteMovie = "Spider-Man: No Way Home";
        String favoriteGenre = "Action and Superhero";
        int releaseYear = 2021;
        int movieDuration = 148;
        int timesWatched = 5;
        String streamingPlatform = "Netflix";
        double hoursPerWeek = 2.5;
        int movieRating = 9;

        // Bonus: Calculate monthly viewing hours (4 weeks)
        double hoursPerMonth = hoursPerWeek * 4;

        // Bonus: Interesting fact
        String funFact = "Theaters are showing Avengers Endgame again in preparation of Doomsday";

        // Display personal movie profile
        System.out.println("==================================");
        System.out.println("       MY PERSONAL MOVIE PROFILE");
        System.out.println("==================================");

        System.out.println("Favorite Movie: " + favoriteMovie);
        System.out.println("Genre: " + favoriteGenre);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Duration: " + movieDuration + " minutes");
        System.out.println("Times Watched: " + timesWatched);
        System.out.println("Favorite Streaming Platform: " + streamingPlatform);
        System.out.println("Watching Time per Week: " + hoursPerWeek + " hours");
        System.out.println("Movie Rating: " + movieRating + "/10");

        System.out.println("----------------------------------");
        System.out.println("BONUS CHALLENGE");
        System.out.println("----------------------------------");

        System.out.println("Watching Time per Month: " + hoursPerMonth + " hours");
        System.out.println("Fun Fact: " + funFact);

        ArrayList<String> movies = new ArrayList<>();
        movies.add("Nightmare Before Christmas");
        movies.add("Coraline");
        System.out.println(movies);
    }
}
