package edu.upvictoria.fpoo;

import org.junit.Test;

public class SumaTest {
    @Test
    public void testSumar() {
        Suma suma = new Suma();
        assertEquals(4, suma.sumar(2, 2));
    }
}
