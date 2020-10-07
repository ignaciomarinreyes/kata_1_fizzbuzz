package test;

import main.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
        assertThat(fizzBuzz.of(1)).isEqualTo("1");
        assertThat(fizzBuzz.of(2)).isEqualTo("2");
    }

    @Test
    public void should_return_fizz_when_it_is_multiple_of_3() {
        assertThat(fizzBuzz.of(3)).isEqualTo("Fizz");
        assertThat(fizzBuzz.of(6)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_buzz_when_it_is_multiple_of_5() {
        assertThat(fizzBuzz.of(5)).isEqualTo("Buzz");
        assertThat(fizzBuzz.of(10)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_fizzbuzz_when_it_is_multiple_of_15() {
        assertThat(fizzBuzz.of(15)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.of(30)).isEqualTo("FizzBuzz");
    }

}
