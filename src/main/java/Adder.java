import java.util.Arrays;

public class Adder {
    private final Delimiters delimiters;

    public Adder(Delimiters delimiters) {
        this.delimiters = delimiters;
    }

    public int sumOf(String s) {
        return Arrays.stream(s.split(delimiters.regex())).mapToInt(Integer::parseInt).sum();
    }
}
