package com.example.user.olympics;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


/**
 * Created by user on 27/06/2017.
 */

public class TestBoxer {

    Boxer boxer;
    Log log;
    FileLogger fileLogger;
    ScreenLogger screenLogger;

    @Test
    public void testGetMedal() {
        boxer = new Boxer(log, 30, 10);
        assertEquals("I won Gold", boxer.enterEvent());
    }

    @Test
    public void testFileWriteTotal(){
        fileLogger = new FileLogger();
        log = new Log(fileLogger);
        boxer = new Boxer(log, 30, 10);
        boxer.goRun(25);
        boxer.goRun(25);
        boxer.goRun(25);
        log.saveSessionsTotal();
        Integer num = 25;
        assertEquals(num, log.getLastSession());
    }

    @Test
    public void testScreenWriteTotal(){
        screenLogger = new ScreenLogger();
        log = new Log(screenLogger);
        boxer = new Boxer(log, 30, 10);
        boxer.goRun(25);
        boxer.goRun(25);
        boxer.goRun(25);
        log.saveSessionsTotal();
        Integer num = 75;
        assertEquals(num, log.getAllSessionsTotal());
    }

}
