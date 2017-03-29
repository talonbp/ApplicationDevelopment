package com.company;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Talon on 3/22/2017.
 */
public class View {
    String Response;

    public static String PromptUser(){
        String Response="";
    Scanner User = new Scanner(System.in);
        System.out.printf("Hello, what would you like to do? (Command options are: Create player, Remove player, Edit player, Nothing)");
    Response = User.next();

        return Response;
    };

    public static void CreateNotify(){
        System.out.printf("Please enter player info as it is requested below");
    };

    public static String Position(){
        String Position;
        Scanner User = new Scanner(System.in);
        System.out.printf("Position: ");
        Position = User.next();
        return Position;
    }

    public static String FName(){
        String FName;
        Scanner User = new Scanner(System.in);
        System.out.printf("First name:  ");
        FName = User.next();

        return FName;
    }

    public static String LName(){
        String LName;
        Scanner User = new Scanner(System.in);
        System.out.printf("Last name: ");
        LName = User.next();

        return LName;
    }

    public static Integer Age(){
        Integer Age;
        Scanner User = new Scanner(System.in);
        System.out.printf("Age:  ");
        while(!User.hasNextInt()) {
            System.out.printf("Age must be a number. Please enter again.");
            User.next();
        }
        Age = User.nextInt();

        return Age;
    }

    public static Double ShootStat(){
        Double ShootStat;
        Scanner User = new Scanner(System.in);
        System.out.printf("Shooting percentage:  ");
        while(!User.hasNextDouble()) {
            System.out.printf("Shooting percentage must be a number. Please enter again.");
            User.next();
        }
        ShootStat = User.nextDouble();

        return ShootStat;
    }
    public static void PortrayTeam(ArrayList Team) {
        System.out.print(Team);
        }


    }
