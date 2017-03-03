package ApplicationControllerPattern;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Alexander Bloomfield on 3/2/2017.
 */
public class MovieTvTaglines {
    public static void main (String[] args) {
        TheGameController LetsPlayTheGame = new TheGameController();

        Scanner DataToFindTagLine = new Scanner(System.in);
        /*
        This is the tag lines that are in it so for and also if you put a blank it will give Nothing was entered. Please try again.
         Cool Runnings
         Criminal Minds
         House M.D.
         Star Wars
         Bones
         Ocean’s Eleven
        */
        System.out.print("Enter a Movie or a TV show and get the tag line for it to come up and you will have to find them: ");

        String MovieAndShow = DataToFindTagLine.nextLine();
        HashMap information = new HashMap();
        information.put("command", MovieAndShow);

        // This is going to see if the user did put something into the the line of if they did not they will get this a them at the line below
        // Nothing was entered. Please try again
        // If they will get it correct it will say something like this for the Movie (Star Wars)
        // A long time ago in a galaxy far, far away....
        if (MovieAndShow.isEmpty()) {System.out.println("Nothing was entered. Please try again");
        } else LetsPlayTheGame.handleRequest((String) information.get("command"), information);
    }
}

