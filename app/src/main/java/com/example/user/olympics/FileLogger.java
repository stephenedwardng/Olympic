package com.example.user.olympics;

import behaviours.Loggable;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

/**
 * Created by user on 27/06/2017.
 */

public class FileLogger implements Loggable {


    public void saveSession(Integer lastSession) throws IOException {
        File file = new File("file.txt");
        PrintWriter printWriter = new PrintWriter("file.txt");
        printWriter.println(String.format("Last session: %d", lastSession));
        printWriter.close();
    };

    public void saveAllSessions(Integer allSessionsTotal) throws IOException{
        File file = new File("file.txt");
        PrintWriter printWriter = new PrintWriter("file.txt");
        printWriter.println(String.format("Total: %d", allSessionsTotal));
        printWriter.close();
    };


}
