package com.company;

/**
 * Created by Talon on 2/11/2017.
 */
public class RunnableDemo implements Runnable {
    private Thread t;
    private Player ID;
    private String Fname;
    private String Lname;
    private Integer age;
    private Double BattAvg;
    public String BattClass;

    RunnableDemo( Player ID, String Fname, String Lname, Integer age, Double BattAvg) {

        System.out.println("Creating player: " +  Fname + " "+Lname + "'s information." );
        ID.setFname(Fname);
        ID.setLname(Lname);
        ID.setAge(age);
        ID.setBattAvg(BattAvg);
        if (ID.getBattAvg() <.1) {
            ID.setBattClass("Rookie level");
        }else if (BattAvg<.2) {
            ID.setBattClass("2nd year skill level");
        }else if (BattAvg<.3) {
            ID.setBattClass("Intermediate skill level");
        }else {
            ID.setBattClass("Professional skill level");
        }
    }

    public void run() {
        try {
            System.out.println("Portraying " +  ID.getFname() + " "+ ID.getLname() );
            Thread.sleep(50);
            System.out.println("Age: " + ID.getAge()+".");
            Thread.sleep(50);
            System.out.println("Batting Average: " + ID.getBattAvg()+".");
            Thread.sleep(50);
            System.out.println("Batting Classification: "+ID.getBattClass() + ".");


                // Let the thread sleep for a while.
                Thread.sleep(50);

        }catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Thread exiting.");
    }

    public void start () {
        System.out.println("Starting " +  ID.getFname()+" "+ID.getLname() );
        if (t == null) {
            t = new Thread (this);
            t.start ();
        }
    }
}
