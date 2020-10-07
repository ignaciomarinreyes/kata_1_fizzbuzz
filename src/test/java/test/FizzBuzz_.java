package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzz_ {
    // Multiplos 3 Fizz, múltiplos 5 Buzz, múltiplos de 3 y 5, FizzBuzz
    // Ej: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz

    @Test
    public void name() {
        String s = new FizzBuzz().get(1);
        assertEquals("1", s);
    }

    private class FizzBuzz {
        public String get(int number) {
            return null;
        }
    }
}
