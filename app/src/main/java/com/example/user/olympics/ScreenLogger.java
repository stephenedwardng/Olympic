package com.example.user.olympics;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import behaviours.Loggable;

/**
 * Created by user on 27/06/2017.
 */

public class ScreenLogger implements Loggable {

    public void saveSession(Integer lastSession) throws IOException {
        System.out.println(String.format("Last session: %d", lastSession));
    };

    public void saveAllSessions(Integer allSessionsTotal) throws IOException{
        System.out.println(String.format("Total: %d", allSessionsTotal));
    };

}
