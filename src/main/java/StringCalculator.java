import java.util.List;

public class StringCalculator {
    public int Add(String numbers) {
        if (isNullOrEmpty(numbers)) {
            return 0;
        }

        Adder adder;
        if(hasCustomDelimiter(numbers)) {
            String delimiters = numbers.substring(2, 3);
            numbers = numbers.substring(4);
            adder = new Adder(new Delimiters(List.of(delimiters)));
        } else {
            adder = new Adder();
        }

        return adder.sumOf(numbers);
    }

    private boolean hasCustomDelimiter(String numbers) {
        return numbers.startsWith("//");
    }

    private boolean isNullOrEmpty(String s) {
        return s == null || s.equals("");
    }
}
