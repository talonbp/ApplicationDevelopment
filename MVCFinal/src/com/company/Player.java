package com.company;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Talon on 3/22/2017.
 */
    public class Player {


        private String Fname;
        private String Lname;
        private Integer age;
        private Double ShootPercentage;
        private String Position;
        public static Integer index;
    public static ArrayList<Player> Team = new ArrayList<>();

    public Integer getIndex() {
        return index;
    };


        public Player(){}
        public Player(String Position, String Fname, String Lname, Integer age, Double ShootPercentage){
            this.Fname=Fname;
            this.Lname=Lname;
            this.age = age;
            this.ShootPercentage = ShootPercentage;
            this.Position = Position;
        }
        public String getFname(){
            return Fname;
        }

        public void setFname(String fname) {
            this.Fname = fname;
        }

        public String getLname(){return Lname;}

        public void setLname(String lname) {
            this.Lname = lname;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public double getShootPercentage() {
            return ShootPercentage;
        }

        public void setShootPercentage(double ShootPercentage) {
            this.ShootPercentage = ShootPercentage;
        }

        public String getPosition() {
            return Position;
        }

        public void setPosition(String Position) {
            this.Position= Position;
        }

        public void StorePlayer(String Position, String fName, String lName, Integer age, Double ShtAvg){

        }


    public static ArrayList<Player> CreatePlayer (String position, String fName, String lName, Integer age, Double ShtPercentage,ArrayList Team){
        Player newPlayer = new Player(position, fName, lName, age, ShtPercentage);
        Integer index = Team.size();
        Team.add(index,newPlayer);
        return  Team;


    }
}
