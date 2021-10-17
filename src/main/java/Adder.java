import java.util.Arrays;

public class Adder {
    private final Delimiters delimiters;

    public Adder(Delimiters delimiters) {
        this.delimiters = delimiters;
    }

    public int sumOf(String s) {
        return Arrays.stream(s.split(delimiters.regex())).mapToInt(Integer::parseInt).peek(n -> {
            if (n < 0) throw new IllegalArgumentException("negatives not allowed " + n);
        }).sum();
    }
}
