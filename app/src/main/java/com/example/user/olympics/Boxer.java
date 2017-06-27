package com.example.user.olympics;

/**
 * Created by user on 27/06/2017.
 */

public class Boxer extends Athlete {

    private int hitsGiven;
    private int hitsTaken;

//    public Boxer(int hitsGiven, int hitsTaken){
//        this.hitsGiven = hitsGiven;
//        this.hitsTaken = hitsTaken;
//    }

    public Boxer(Log log, int hitsGiven, int hitsTaken){
        super(log);
        this.hitsGiven = hitsGiven;
        this.hitsTaken = hitsTaken;
    }

    @Override
    public int calculate(){
        return this.hitsGiven - this.hitsTaken;
    }
}
