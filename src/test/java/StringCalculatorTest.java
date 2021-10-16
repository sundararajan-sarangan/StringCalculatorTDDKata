import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    public void shouldReturn0WhenNullStringIsSupplied() {
        assertEquals(0, new StringCalculator().Add(null));
    }

    @Test
    public void shouldReturn0WhenEmptyStringIsSupplied() {
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.Add("");
        assertEquals(0, sum);
    }

    @Test
    public void shouldReturn3WhenStringWithOneNumber3IsSupplied() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.Add("3"));
    }

    @Test
    public void shouldReturn7WhenStringWithOneNumber7IsSupplied() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(7, stringCalculator.Add("7"));
    }

    @Test
    public void shouldReturn10WhenTwoNumbers6And4AreSupplied() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(10, stringCalculator.Add("6,4"));
    }

    @Test
    public void shouldReturn7WhenTwoNumbers4And3AreSupplied() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(7, stringCalculator.Add("4,3"));
    }

    @Test
    public void shouldReturn12WhenThreeNumbers4And4And4AreSupplied() {
        assertEquals(12, new StringCalculator().Add("4,4,4"));
    }

    @Test
    public void shouldReturnSumWhenNewLineIsSupplied() {
        assertEquals(16, new StringCalculator().Add("13\n3"));
    }

    @Test
    public void shouldReturnSumWhenCommasAndNewLinesAreMixed() {
        assertEquals(22, new StringCalculator().Add("13,7\n2"));
    }

    @Test
    public void shouldAcceptSemiColonAsCustomDelimiter() {
        assertEquals(3, new StringCalculator().Add("//;\n1;2"));
    }
}
