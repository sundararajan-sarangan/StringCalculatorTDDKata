import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Adder {
    private static final String COMMA = ",";
    private static final String NEWLINE = "\n";
    private final List<String> delimiters;

    public Adder() {
        this.delimiters = List.of(COMMA, NEWLINE);
    }

    public int sumOf(String s) {
        String[] commaSeparatedNumbers = s.split(delimiters.get(0));
        List<String> nums = new ArrayList<>();
        for(String commaSeparatedNumber : commaSeparatedNumbers) {
            String[] newLineSeparatedArray = commaSeparatedNumber.split(delimiters.get(1));
            Collections.addAll(nums, newLineSeparatedArray);
        }

        return nums.stream().mapToInt(Integer::parseInt).sum();
    }
}
