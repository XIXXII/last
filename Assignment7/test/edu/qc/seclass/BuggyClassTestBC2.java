package edu.qc.seclass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuggyClassTestBC2 {
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
    public void testMethod2() {
        assertEquals(0, myBuggyClass.buggyMethod2(2,0));
        assertEquals(0, myBuggyClass.buggyMethod2(-1,-2));
    }
}
