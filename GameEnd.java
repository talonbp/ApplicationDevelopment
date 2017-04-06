package com.company;

/**
 * Created by Talon on 4/5/2017.
 */
public class GameEnd implements Runnable {
    private String time;

    public GameEnd(String S){
        this.time= S;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Away team chant: "  + time);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " Home team chant: Defense, Defense, Defense");
    }
    private void processCommand(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    @Override
    public String toString(){
        return this.time;
    }

}