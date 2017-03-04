package com.company;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Create a tree set
        TreeSet ClassList = new TreeSet();
        TreeSet PY = new TreeSet();
        Scanner reader = new Scanner(System.in);
        String Name;

        // Add elements to the tree set
        PY.add("Pitchforth, Talon");
        PY.add("Allabastar, Ryan");
        PY.add("Kid, Willy");

        System.out.println("Last year's class: " + PY);

        PY.remove("Pitchforth, Talon");

        ClassList.addAll(PY);
        PY.clear();
        System.out.println("Student's from last year's class in this year's class: " + ClassList);

//        Note that duplicates are not retained in the Treeset. This is shown when the final class list is printed to the screen
        ClassList.add("Johnson, Bill");
        ClassList.add("Aaronson, Reyes");
        ClassList.add("Darnell, David");
        ClassList.add("Darnell, David");

//        Portrays first student on list
        System.out.print(ClassList.first());
        System.out.println("Type the name of the person you are looking for in the following format: Lastname, Firstname.");
        Name = reader.nextLine();

//        Ability to see if the TreeSet contains a specific thing.
        if (ClassList.contains(Name)) {
            System.out.println("Specified student is in this class.");
        } else {
            System.out.println("Specified student is not in this class.");
        }

        System.out.println("This year's list after all additions: " + ClassList);}
}
