package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private final String Buzz = "Buzz";
    @Test
    public void should_return_Buzz_when_countOff_multiple_5(){
        //Given
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String result = fizzBuzz.countOff(number);
        //Then
        assertEquals(Buzz,result);
    }
}
