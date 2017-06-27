package com.example.user.olympics;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 27/06/2017.
 */

public class Log {

    private ArrayList<Integer> runs;

    public Log(){
        this.runs = new ArrayList<>();
    }

    public void addRun(int distance){
        runs.add(distance);
    }

    public Integer getLastSession(){
        return runs.get(runs.size() -1);
    }

    public Integer getAllSessionsTotal(){
        int total = 0;
        for (Integer run : runs){
            total += run;
        }
        return total;
    }
}
