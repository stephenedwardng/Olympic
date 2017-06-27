package com.example.user.olympics;

/**
 * Created by user on 27/06/2017.
 */

public abstract class Athlete {

    Log log;

    public Athlete(Log log){
        this.log = log;
    }

    public String enterEvent() {
        prepare();
        compete();
        int total = calculate();
        return award(total);
    }

    public void prepare() {
        System.out.println("I am preparing HARD!");
    }

    public void compete() {
        System.out.println("I am competing HARD! Grrrr");
    }

    public String award(int total) {

        String medal = "";
        if (total >= 15) {
            medal = "Gold";
        } else if (total >= 10) {
            medal = "Silver";
        } else if (total >= 5) {
            medal = "Bronze";
        } else {
            medal = "Nothing. Loooossseerrr.";
        }

        System.out.println(String.format("I won %s", medal));
        return String.format("I won %s", medal);
    }

    public abstract int calculate();

    public void goRun(int distance){
        log.addRun(distance);
    }

    public int currentSession(){
        return log.getLastSession();
    }

    public int sessionsTotal(){
        return log.getAllSessionsTotal();
    }

}
