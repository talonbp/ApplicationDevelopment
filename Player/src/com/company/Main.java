package com.company;

import java.util.HashMap;
import java.util.*;
import java.util.Scanner;

public class Main extends Thread {

    public static void main(String[] args) {
        Boolean check = true;
        Player Hawk = new Player();
        Player Tony = new Player();
        Player William = new Player();
        Player Hiker = new Player();
        Player UserDefined = new Player();
        Player ForPrint = new Player();
        Integer Num;
        Num = 2;

        RunnableDemo R1 = new RunnableDemo(Hawk, "Tony", "Hawk", 39, .33);
        RunnableDemo R2 = new RunnableDemo(Tony, "Tyler", "Willis", 12, .12);
        RunnableDemo R3 = new RunnableDemo(William, "Billy", "The Kid", 23, .21);
        RunnableDemo R4 = new RunnableDemo(Hiker, "Mountain", "Hiker", 23, .37);

        Scanner updatePlayer=new Scanner(System.in);
        System.out.println("You have just drafted a player to your team. Prepare to enter player information.");
        System.out.println("Enter player's first name:");
        String Fname= null;

            try {
                Fname = updatePlayer.next();

            } catch (Exception e) {
                e.printStackTrace();
            }

        System.out.println("Enter player's last name:");
        String Lname = null;

            try {
                Lname = updatePlayer.next();
            } catch (Exception e) {
                e.printStackTrace();
            }

        System.out.println("Enter player's age:");
        Integer age = null;

        while(!updatePlayer.hasNextInt()) {
            System.out.printf("Age must be an integer. Please enter again.");
            updatePlayer.next();
        }
            age= updatePlayer.nextInt();

        System.out.println("Enter player's batting average:");

        Double BattAvg = null;

        while(!updatePlayer.hasNextDouble()) {
            System.out.printf("Age must be a number. Please enter again.");
            updatePlayer.next();
        }

        BattAvg= updatePlayer.nextDouble();


        RunnableDemo R5 = new RunnableDemo(UserDefined, Fname, Lname, age, BattAvg);

////Starts HashMap
//
//
    HashMap <String,String> Coll= new HashMap<>();
    try {
        Coll.put("Short stop", Hawk.getFname()+" "+ Hawk.getLname());
    } catch (java.lang.Exception exception) {
        exception.printStackTrace();
    }
        Coll.put("Pitcher", Tony.getFname()+" " +Tony.getLname());
        Coll.put("Catcher", William.getFname() + " " + William.getLname() );

    //Creates iterator
        Set set = Coll.entrySet();
        Iterator i = set.iterator();

        while(i.hasNext()) {
            Map.Entry CollMap = (Map.Entry)i.next();
            System.out.print(CollMap.getKey() + ": ");
            System.out.println(CollMap.getValue());
            Coll.get(CollMap.getValue());
        }
        String Person = Coll.get("Short stop");
        System.out.printf(""+"The short stops name is: "+Person);

    //Prints current HashMap Coll
        System.out.printf("%n"+Coll);

    //Removes "Pitcher" from HashMap Coll
        Coll.remove("Pitcher");

    //Prints HashMap Coll with "Dad" removed
        System.out.printf("%n"+Coll);


//        //Creates new ArrayList

        ArrayList<String> Plist = new ArrayList();
        System.out.println("Initial size of Plist: " + Plist.size());

        // add elements to the array list
        Plist.add(Hawk.getFname()+" "+ Hawk.getLname());
        Plist.add(William.getFname()+" "+ William.getLname());
        Plist.add(Hiker.getFname()+" "+ Hiker.getLname());
        Num = Plist.indexOf(William.getFname()+" "+William.getLname());
        Plist.add(Num - 1, Tony.getFname()+" "+Tony.getLname());
        System.out.println("Size of Plist after additions: " + Plist.size());

        // display the array list

        System.out.println("Contents of Plist: " + Plist);

        // Remove elements from the array list
        Plist.remove("Tyler Willis");
        Plist.remove(2);
        System.out.println("Size of Plist after deletions: " + Plist.size());
        System.out.println("Contents of Plist: " + Plist);

    }
}