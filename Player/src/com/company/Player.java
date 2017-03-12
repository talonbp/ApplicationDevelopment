package com.company;

/**
 * Created by Talon on 2/10/2017.
 */
public class Player {

    private String Fname;
    private String Lname;
    private Integer age;
    private Double BattAvg;
    public String BattClass;

    public Player(){}
    public Player(String Fname, String Lname, Integer age, Double BattAvg, String BattClass){
    this.Fname=Fname;
    this.Lname=Lname;
    this.age = age;
    this.BattAvg = BattAvg;
    this.BattClass = BattClass;
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

    public double getBattAvg() {
        return BattAvg;
    }

    public void setBattAvg(double battAvg) {
        this.BattAvg = battAvg;
    }

    public String getBattClass() {
        return BattClass;
    }

    public void setBattClass(String BattClass) {
        this.BattClass= BattClass;
    }
}

