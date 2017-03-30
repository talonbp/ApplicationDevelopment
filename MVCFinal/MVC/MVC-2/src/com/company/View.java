package com.company;

import java.util.*;

/**
 * Created by Talon on 3/30/2017.
 */
public class View {
    String Response;
public static void Initial(){
    System.out.printf("Welcome, you are the coach of the best basketball team in the United States. As the coach, you get to decide who is on the roster. The following are your starters: ");
}
    public static String PromptUser(){
        String Response="";
        Scanner User = new Scanner(System.in);
        System.out.printf("What would you like to do? (Command options are: Substitute, Nullify, Nothing)");
        Response = User.nextLine();

        return Response;
    };

    public static void CreateNotify(){
        System.out.printf("Please enter player info as it is requested below");
    };

    public static String Position(){
        String Position;
        Scanner User = new Scanner(System.in);
        System.out.printf("Position you would like to sub out (Must match display above): ");
        Position = User.nextLine();
        return Position;
    }

    public static String Name(){
        String FName;
        Scanner User = new Scanner(System.in);
        System.out.printf("Full name of player you wish to sub in:  ");
        FName = User.nextLine();

        return FName;
    }
    public static String Nullify(){
        String PositionToNull;
        Scanner User = new Scanner(System.in);
        System.out.printf("Which player (enter the position of the player) would you like to nullify? (Note: Spelling and case must match those displayed above)");

        PositionToNull = User.nextLine();

        return PositionToNull;
    }

    public static void Adjustment(){
        System.out.printf("The adjustments have been made. Your team now consists of the following: ");
    }

    public static void InvalidEntry(){
    System.out.printf("Invalid entry. You will be prompted for a valid command.");
    }

    public static void Exit(){
        System.out.printf("Exiting.");
    }

    public static void PortrayTeam(HashMap Team) {
        Set set = Team.entrySet();
        Iterator i = set.iterator();

        while(i.hasNext()) {
            Map.Entry TeamMap = (Map.Entry)i.next();
            System.out.print(TeamMap.getKey() + ": ");
            System.out.println(TeamMap.getValue()+" ");
            Team.get(TeamMap.getValue());
        }
    }


}
