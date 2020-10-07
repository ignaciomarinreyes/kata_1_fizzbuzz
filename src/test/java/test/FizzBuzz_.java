package test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzz_ {
    // Multiplos 3 Fizz, múltiplos 5 Buzz, múltiplos de 3 y 5, FizzBuzz
    // Ej: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_number_when_it_is_not_fizz_and_not_buzz() {
        assertEquals("1", fizzBuzz.get(1));
    }

    public class FizzBuzz {
        public String get(int number) {
            return "1";
        }
    }
}
