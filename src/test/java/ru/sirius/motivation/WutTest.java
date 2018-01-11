package ru.sirius.motivation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WutTest {
    @Test
    public void testF() throws Exception {
        assertEquals(2, Wut.f(1, 2), 1e-1);
        assertEquals(3, Wut.f(1, 3), 1e-1);
        assertEquals(4, Wut.f(1, 4), 1e-1);
        assertEquals(9, Wut.f(2, 3), 1e-1);
        assertEquals(27, Wut.f(3, 3), 1e-1);
        assertEquals(81, Wut.f(4, 3), 1e-1);
        assertEquals(32, Wut.f(5, 2), 1e-1);
        assertEquals(64, Wut.f(6, 2), 1e-1);
        assertEquals(128, Wut.f(7, 2), 1e-1);
    }
    
}
