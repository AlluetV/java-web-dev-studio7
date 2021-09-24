package org.launchcode.studio7;

import java.util.HashMap;

public class Main {

    public static void main(String[] args){


        HashMap<Integer,String> cdSongs = new HashMap<>();

        cdSongs.put(1, "The Sky is a Neighborhood");
        cdSongs.put(2, "Learn to Fly");
        cdSongs.put(3, "Time like This");

        HashMap<Integer, String> dvdMovies = new HashMap<>();
        dvdMovies.put(1, "Spirited Away");
        dvdMovies.put(2, "Nightmare Before Christmas");
        dvdMovies.put(3, "Alice in Wonderland");

        // TODO: Declare and initialize a CD and a DVD object.
        CD fooFighters = new CD(" Indie/Rock",13,"CD","200-500",cdSongs);
        DVD kidsMovies = new DVD("KidsMix",6,"DVD","570-1600",dvdMovies);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println("CD disk\n");
        fooFighters.spin();
        fooFighters.readData();
        fooFighters.rewindDisc();
        fooFighters.pause();


        System.out.println("\nDVD disk");
        kidsMovies.spin();
        kidsMovies.reportData();

    }
}
