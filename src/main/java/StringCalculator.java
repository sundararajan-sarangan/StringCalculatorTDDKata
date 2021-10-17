import java.util.List;

public class StringCalculator {
    public int Add(String numbers) {
        if (isNullOrEmpty(numbers)) {
            return 0;
        }

        if(numbers.startsWith("//;"))
            return new Adder(new Delimiters(List.of(";"))).sumOf(numbers.substring(4));

        return new Adder().sumOf(numbers);
    }

    private boolean isNullOrEmpty(String s) {
        return s == null || s.equals("");
    }
}
