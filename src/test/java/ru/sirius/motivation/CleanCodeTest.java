package ru.sirius.motivation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CleanCodeTest {
    @Test
    public void fastPow() throws Exception {
        assertEquals(2, CleanCode.fastPow(2, 1), 1e-1);
        assertEquals(3, CleanCode.fastPow(3, 1), 1e-1);
        assertEquals(4, CleanCode.fastPow(4, 1), 1e-1);
        assertEquals(9, CleanCode.fastPow(3, 2), 1e-1);
        assertEquals(27, CleanCode.fastPow(3, 3), 1e-1);
        assertEquals(81, CleanCode.fastPow(3, 4), 1e-1);
        assertEquals(32, CleanCode.fastPow(2, 5), 1e-1);
        assertEquals(64, CleanCode.fastPow(2, 6), 1e-1);
        assertEquals(128, CleanCode.fastPow(2, 7), 1e-1);
    }
    
}
