package com.company;

public class Main extends Thread{

    public static void main(String[] args) {
        Player Hawk=new Player();
        Player Tony=new Player();
        Player William=new Player();
        Player Hiker=new Player();

        RunnableDemo R1 = new RunnableDemo(Hawk, "Tony","Hawk",39,.33);
        RunnableDemo R2= new RunnableDemo(Tony, "Tyler","Tony",12,.12);
        RunnableDemo R3=new RunnableDemo(William, "Billy","The Kid",23, .21);
        RunnableDemo R4=new RunnableDemo(Hiker, "Mountain","Hiker",23, .37);

    }



}
