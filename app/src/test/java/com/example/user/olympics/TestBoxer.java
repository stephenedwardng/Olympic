package com.example.user.olympics;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


/**
 * Created by user on 27/06/2017.
 */

public class TestBoxer {

    Boxer boxer;

    @Before
    public void before() {
        boxer = new Boxer(30, 10);
    }

    @Test
    public void testGetMedal() {
        assertEquals("I won Gold", boxer.enterEvent());
    }

}
