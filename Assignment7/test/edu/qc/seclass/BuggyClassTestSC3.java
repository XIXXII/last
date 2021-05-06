package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuggyClassTestSC3 {
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
    public void testMethod3() {
        assertEquals(0, myBuggyClass.buggyMethod3(5,0));
    }
}
