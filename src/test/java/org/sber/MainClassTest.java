package org.sber;

import junit.framework.TestCase;

public class MainClassTest extends TestCase {

    public void testIntSum() {
        MainClass s = new MainClass();
        assertEquals(5, s.intSum(2, 3));
    }

    public void testDoubleSum() {
        MainClass s = new MainClass();
        assertEquals(6.0, s.doubleSum(2.0, 4.0));
    }

}
