package com.example.user.olympics;

import org.junit.Test;
import org.junit.Before;

import java.io.File;

import static org.junit.Assert.*;


/**
 * Created by user on 27/06/2017.
 */

public class TestGymnast {

    FileLogger fileLogger;
    Gymnast gymnast;
    Log log;

    @Before
    public void before() {
        fileLogger = new FileLogger();
        log = new Log(fileLogger);
        gymnast = new Gymnast(log, 3, 10);
    }

    @Test
    public void testGetMedal() {
        assertEquals("I won Silver", gymnast.enterEvent());
    }

    @Test
    public void testGoForRun(){
        gymnast.goRun(25);
        assertEquals(25, gymnast.currentSession());
    }

    @Test
    public void testGoForRuns(){
        gymnast.goRun(25);
        gymnast.goRun(25);
        gymnast.goRun(25);
        assertEquals(75, gymnast.sessionsTotal());
    }

}
