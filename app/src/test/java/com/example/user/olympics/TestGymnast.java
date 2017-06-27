package com.example.user.olympics;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


/**
 * Created by user on 27/06/2017.
 */

public class TestGymnast {

    Gymnast gymnast;

    @Before
    public void before() {
        gymnast = new Gymnast(3, 10);
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
