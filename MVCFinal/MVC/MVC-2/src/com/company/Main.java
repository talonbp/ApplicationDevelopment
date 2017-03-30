package com.company;

import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Creates HashMap for the roster
        HashMap<String,String> Team = new HashMap<>();
        Team=Player.getTeam();
        controller(Team);
    }

        static void controller(){};

        static void controller(HashMap Team) {
        String position;
        String Name;
        String Action;
        Action = "";
        String positionToNullify;
        Integer index;
        HashMap<String,String> team = new HashMap<>();
        team=Team;
        Integer Starter = 1;
        View.Initial();
            View.PortrayTeam(Player.getTeam());
        //Runs loop to allow coach to make changes
        while (!Action.equals("Nothing")){
            if (!Starter.equals(1)) {
                Action = View.PromptUser();
            }
            Starter=2;
            if (Action.equals("Substitute")) {
                position = View.Position();
                Name= View.Name();
                Player.UpdateTeam(Team,position,Name);
                View.Adjustment();
                View.PortrayTeam(Team);
            }

            else if (Action.equals( "Nullify")) {
               positionToNullify=View.Nullify();
               Team= Player.NullifyPlayer(Team, positionToNullify);
               View.Adjustment();
               View.PortrayTeam(Team);
            }

            else if (Action.equals("Nothing") ){
                View.Exit();
            }

            else {
                View.InvalidEntry();
            }
        }
    }
}
