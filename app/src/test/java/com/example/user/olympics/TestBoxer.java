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

    @Before
    public void before() {
        fileLogger = new FileLogger();
        log = new Log(fileLogger);
        boxer = new Boxer(log, 30, 10);
    }

    @Test
    public void testGetMedal() {
        assertEquals("I won Gold", boxer.enterEvent());
    }

//    @Test
//    public void testFileWrite(){
//        boxer.goRun(25);
//        boxer.goRun(25);
//        boxer.goRun(25);
//        log.saveCurrentSession();
//        Integer num =25;
//        assertEquals(num, log.getLastSession());
//    }

    @Test
    public void testFileWriteTotal(){
        boxer.goRun(25);
        boxer.goRun(25);
        boxer.goRun(25);
        log.saveSessionsTotal();
        Integer num =25;
        assertEquals(num, log.getLastSession());
    }

}
