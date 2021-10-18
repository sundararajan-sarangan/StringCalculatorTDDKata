import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Adder {
    private final Delimiters delimiters;

    public Adder(Delimiters delimiters) {
        this.delimiters = delimiters;
    }

    public int validateAndFindSumOf(String s) {
        List<Integer> invalidNumbers = new ArrayList<>();
        int sum = Arrays.stream(s.split(delimiters.regex())).mapToInt(Integer::parseInt).peek(n -> {
            if (n < 0) invalidNumbers.add(n);
        }).sum();

        if(invalidNumbers.size() > 0) {
            StringBuilder numbersNotAllowed = new StringBuilder().append("negatives not allowed");
            invalidNumbers.forEach(n -> numbersNotAllowed.append(" ").append(n));
            throw new IllegalArgumentException(numbersNotAllowed.toString());
        }

        return sum;
    }
}
