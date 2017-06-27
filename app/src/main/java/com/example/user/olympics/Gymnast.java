package com.example.user.olympics;

/**
 * Created by user on 27/06/2017.
 */

public class Gymnast extends Athlete {

    private int eventDifficulty;
    private int eventExecution;

    public Gymnast(Log log, int eventDifficulty, int eventExecution) {
        super(log);
        this.eventDifficulty = eventDifficulty;
        this.eventExecution = eventExecution;
    }

    @Override
    public int calculate() {
        return this.eventDifficulty + this.eventExecution;
    }

}
