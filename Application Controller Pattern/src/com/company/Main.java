package com.company;

import java.rmi.activation.ActivationGroup_Stub;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       ThePlayerController PlayerStatRetrieval = new ThePlayerController();

        Scanner ScanForPlayer= new Scanner(System.in);

        String PlayerName="Null";
        /*
        This is the tag lines that are in it so for and also if you put a blank it will give Nothing was entered. Please try again.
         Michael Jordan
         Kobe Bryant
         Lebron James
         Pistol Pete
         John Stockton
         Ray Allen

        */

        while(!PlayerName.equals("Done")){
        System.out.print("Enter the name of a player and the greatest number of points they scored in one game will be displayed" +"\n"+
                "along with the date and the team they were playing against. Type 'Done' to exit. Player name options are:" +"\n" +
                "Michael Jordan, Pistol Pete, Lebron James, Kobe Bryant, John Stockton, and Ray Allen. Spelling is important. ");

        PlayerName = ScanForPlayer.nextLine();
        HashMap information = new HashMap();
        information.put("command", PlayerName);

        // This is going to see if the user did put something into the the line of if they did not they will get this a them at the line below
        // Nothing was entered. Please try again
        // If they will get it correct it will say something like this for the Movie (Star Wars)
        // A long time ago in a galaxy far, far away....
        if (PlayerName.isEmpty()) {System.out.println("Nothing was entered. Please try again");
        } else PlayerStatRetrieval.handleRequest((String) information.get("command"), information);
    }
}
}



