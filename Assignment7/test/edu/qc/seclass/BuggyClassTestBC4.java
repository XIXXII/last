package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuggyClassTestBC4 {
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
    public void testMethod4() {
        assertEquals(53, myBuggyClass.buggyMethod4(100,100));
        assertEquals(12, myBuggyClass.buggyMethod4(-25,-2));

    }
}
