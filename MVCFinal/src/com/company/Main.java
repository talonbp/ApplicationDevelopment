package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<Player> Team = new ArrayList<>();
        controller(Team);
    }


        static void controller(){};
        static void controller(ArrayList Team) {
        String position;
        String fName;
        String lName;
        Integer age;
        Double ShootStat;
        String Action;
        Action = "";
        Integer index;
        ArrayList<Player> team = new ArrayList();
                team=Team;

        while (!Action.equals("Nothing")){
            Action = View.PromptUser();
        if (Action.equals("Create player")) {
            position = View.Position();
            fName= View.FName();
            lName= View.LName();
            age=View.Age();
            ShootStat=View.ShootStat();
            Team=Player.CreatePlayer (position, fName, lName, age, ShootStat,Team);
            View.PortrayTeam(Team);


        }
        else if (Action.equals( "Remove player")) {
            System.out.printf("Run away1");
        } else if (Action.equals("Edit player") ){
            System.out.printf("Run away2");
        } else if (Action.equals("Nothing") ){
            System.out.printf("Run away3");
        }
        else {
            System.out.printf("Run away4");
        }
    }

}
}