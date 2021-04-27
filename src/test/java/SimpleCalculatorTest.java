import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {

    @Test
    @DisplayName("Method should check for a number and returns it")
    public void getFirstNumberTest (){

        SimpleCalculator FirstNumber = new SimpleCalculator();

        double expected = 5.0;

        FirstNumber.setFirstNumber(expected);
        double actual = FirstNumber.getFirstNumber();

        assertEquals(expected,actual);

    }

    @Test
    @DisplayName("Method should check for a number and returns it")
    public void getSecondNumberTest () {

        SimpleCalculator SecondNumber = new SimpleCalculator();

        double expected = 4.0;

        SecondNumber.setSecondNumber(expected);
        double actual = SecondNumber.getSecondNumber();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Method should check add first number and second number and returns it")
    public void getAdditionResultTest () {

        SimpleCalculator FirstNumber = new SimpleCalculator();
        SimpleCalculator SecondNumber = new SimpleCalculator();

        double expectedFirstNumber = 5.0;
        double expectedSecondNumber = 4.0;
        double expectedResult = 9.0;

        FirstNumber.setFirstNumber(expectedFirstNumber);
        SecondNumber.setSecondNumber(expectedSecondNumber);

        double actual = FirstNumber.getAdditionResult();


        assertEquals(expectedResult, actual);
    }


}
