package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(1);
        System.out.println("Michael Jordan has the ball and the clock is winding down. The visiting crowd is counting down the clock while the home team's crowd is chanting 'Defense, Defense, Defense'");
        // For the i part it is going to start on therad 1 and end on one less than the i #
        for (int i = 22; i > -1; i--){
            Runnable Game= new GameEnd(" " + i);
            executor.execute(Game);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {

        }
        System.out.println("The game has ended, Michael drained a three as time expired. Have a safe trip home!");
    }
}