import java.util.List;

public class StringCalculator {
    public int Add(String numbers) {
        if (isNullOrEmpty(numbers)) {
            return 0;
        }

        Adder adder;
        if(hasCustomDelimiter(numbers)) {
            String delimiters = extractDelimitersFrom(numbers);
            numbers = extractNumbersFrom(numbers);
            adder = new Adder(new Delimiters(List.of(delimiters)));
        } else {
            adder = new Adder();
        }

        return adder.sumOf(numbers);
    }

    private boolean isNullOrEmpty(String s) {
        return s == null || s.equals("");
    }

    private String extractDelimitersFrom(String numbers) {
        return numbers.substring(2, 3);
    }

    private boolean hasCustomDelimiter(String numbers) {
        return numbers.startsWith("//");
    }

    private String extractNumbersFrom(String numbers) {
        return numbers.substring(4);
    }
}
