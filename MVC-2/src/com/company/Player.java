package com.company;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Talon on 3/30/2017.
 */
public class Player {





    public static HashMap<String, String> getTeam (){

        HashMap <String,String> Team = new HashMap<>();

        Team.put("Point Guard","Jeremy Pitchforth");
        Team.put("Shooting Guard", "Talon Pitchforth");
        Team.put("Small Forward", "Jamie Pitchforth");
        Team.put("Power Forward", "Kellie Pitchforth");
        Team.put("Center", "Dad Pitchforth");

        return  Team;


    }
    public static HashMap<String,String> NullifyPlayer(HashMap Team, String Position){
        Team.put(Position, "");
        return Team;
    }

    public static HashMap<String,String> UpdateTeam(HashMap Team, String Position, String Name){

        Team.put(Position,Name);

        return Team;
    }
}
