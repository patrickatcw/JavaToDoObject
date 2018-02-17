package com.me;

public class Main {

    public static void main(String[] args) {

        //building new instances, creating new objects
       ToDo monday = new ToDo(6, "shower", "run", "salad");
       ToDo tuesday = new ToDo(7, "gym", "code", "chicken and rice");

        //printout logic
       /*
        System.out.println("Movie Info: " + a.getTitle() + ", " + a.getYear() + ", " + a.getRating()
                + ", " + a.getGenre() + ", " + a.getLength() + " minutes");*/
        System.out.println("Here is a small snap-shot of the morning routine during the week;");
        System.out.println("On Monday, wake up at " + monday.getWake() + " a.m., take a " + monday.getNext()
                + ", then go for a " + monday.getWork() + ", then eat a " + monday.getLunch() + " for lunch.");
        System.out.println("On Tuesday, wake up at " + tuesday.getWake() + " a.m., go to the " + tuesday.getNext()
                + ", then work on " + tuesday.getWork() + ", then have some " + tuesday.getLunch() + " for lunch.");

    }

}
//results
    /*Here is a small snap-shot of the morning routine during the week;
        On Monday, wake up at 6 a.m., take a shower, then go for a run, then eat a salad for lunch.
        On Tuesday, wake up at 7 a.m., go to the gym, then work on code, then have some chicken and rice for lunch.*/
