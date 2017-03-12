package com.company;

/**
 * Created by Talon on 2/20/2017.
 */
import java.util.HashMap;

public class Coll {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

//Creates HashMap Coll
        HashMap <String,String> Coll= new HashMap<>();

        //Adds family members to HashMap Coll
        try {
            Coll.put("Kellie", "Five feet ten inches");
        } catch (java.lang.Exception exception) {
            exception.printStackTrace();
        }
        Coll.put("Talon", "Six feet two inches");
        Coll.put("Dad", "Six feet one inch");

        Set set = Coll.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry Coll = (Map.Entry)i.next();
            System.out.print(Coll.getKey() + ": ");
            System.out.println(Coll.getValue());

        //Assigns value of Kellie to a variable and prints her height to screen
        String Person = Coll.get("Kellie");
        System.out.printf(""+"Kellie's height is: "+Person+".");

        //Prints current HashMap Coll
        System.out.printf("%n"+Coll);

        //Removes "Dad" from HashMap Coll
        Coll.remove("Dad");

        //Prints HashMap Coll with "Dad" removed
        System.out.printf("%n"+Coll);
    }
}