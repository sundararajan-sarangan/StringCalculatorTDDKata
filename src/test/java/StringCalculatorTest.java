import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    public void shouldReturn0WhenNullStringIsSupplied() throws Exception {
        assertEquals(0, new StringCalculator().Add(null));
    }

    @Test
    public void shouldReturn0WhenEmptyStringIsSupplied() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.Add("");
        assertEquals(0, sum);
    }

    @Test
    public void shouldReturn3WhenStringWithOneNumber3IsSupplied() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.Add("3"));
    }

    @Test
    public void shouldReturn7WhenStringWithOneNumber7IsSupplied() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(7, stringCalculator.Add("7"));
    }

    @Test
    public void shouldReturn10WhenTwoNumbers6And4AreSupplied() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(10, stringCalculator.Add("6,4"));
    }

    @Test
    public void shouldReturn7WhenTwoNumbers4And3AreSupplied() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(7, stringCalculator.Add("4,3"));
    }

    @Test
    public void shouldReturn12WhenThreeNumbers4And4And4AreSupplied() throws Exception {
        assertEquals(12, new StringCalculator().Add("4,4,4"));
    }

    @Test
    public void shouldReturnSumWhenNewLineIsSupplied() throws Exception {
        assertEquals(16, new StringCalculator().Add("13\n3"));
    }

    @Test
    public void shouldReturnSumWhenCommasAndNewLinesAreMixed() throws Exception {
        assertEquals(22, new StringCalculator().Add("13,7\n2"));
    }

    @Test
    public void shouldAcceptSemiColonAsCustomDelimiter() throws Exception {
        assertEquals(3, new StringCalculator().Add("//;\n1;2"));
    }

    @Test
    public void shouldAcceptHyphenAsCustomDelimiter() throws Exception {
        assertEquals(9, new StringCalculator().Add("//-\n8-1"));
    }

    @Test
    public void shouldThrowExceptionWhenAnyNegativeNumbersAreSupplied() {
        Exception thrown = assertThrows(Exception.class, () -> new StringCalculator().Add("//;\n3;2;-1"));
        assertTrue(thrown.getMessage().contains("negatives not allowed -1"));
    }
}
