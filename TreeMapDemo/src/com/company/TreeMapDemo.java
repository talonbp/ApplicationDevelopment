package com.company;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
	// write your code here
        TreeMap ages = new TreeMap();

        // Put elements to the map
        ages.put("Talon", new Integer(24));
        ages.put("Kellie", new Integer(22));
        ages.put("Tyler", new Integer(30));
        ages.put("Jeremy", new Integer(28));
        ages.put("Jamie", new Integer(27));
        ages.put("Mom", new Integer(59));
        ages.put("Dad", new Integer(59));

        // Get a set of the entries
        Set set3 = ages.entrySet();

        // Get an iterator
        Iterator i3 = set3.iterator();

        // Display elements

        System.out.printf("Printing Family Members' ages:");
        while(i3.hasNext()) {
            Map.Entry agesSet = (Map.Entry)i3.next();
            System.out.print(agesSet.getKey() + ": ");
            System.out.println(agesSet.getValue());
        }
        System.out.println();

        // Deposit 1000 into Zara's account
        Integer ageValue = ((Integer)ages.get("Talon"));
        ages.put("Talon", new Double(ageValue + 1));
        System.out.println("Talon's new age: " + ages.get("Talon"));}
}
