import java.util.List;

public class StringCalculator {
    public int Add(String numbers) {
        if (isNullOrEmpty(numbers)) {
            return 0;
        }

        Delimiters delimiters = extractDelimitersFrom(numbers);
        numbers = discardDelimitersFrom(numbers);

        return new Adder(delimiters).validateAndFindSumOf(numbers);
    }

    private boolean isNullOrEmpty(String s) {
        return s == null || s.equals("");
    }

    private Delimiters extractDelimitersFrom(String numbers) {
        return hasCustomDelimiter(numbers)
                ? new Delimiters(List.of(numbers.substring(2, 3)))
                : new Delimiters();
    }

    private String discardDelimitersFrom(String numbers) {
        return hasCustomDelimiter(numbers) ? numbers.substring(4) : numbers;
    }

    private boolean hasCustomDelimiter(String numbers) {
        return numbers.startsWith("//");
    }
}
