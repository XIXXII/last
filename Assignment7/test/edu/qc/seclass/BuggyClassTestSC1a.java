package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuggyClassTestSC1a {
    private BuggyClass myBuggyClass;

    @Before
    public void setUp() {
        myBuggyClass = new BuggyClass();
    }

    @After
    public void tearDown() {
        myBuggyClass = null;
    }

    @Test
    public void testMethod1() {
        assertEquals(3, myBuggyClass.buggyMethod1(2,3));
        assertEquals(1, myBuggyClass.buggyMethod1(-1,-1));
    }
}