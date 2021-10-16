import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Adder {
    private static final String COMMA = ",";
    private static final String NEWLINE = "\n";

    public int sumOf(String s) {
        String[] commaSeparatedNumbers = s.split(COMMA);
        List<String> nums = new ArrayList<>();
        for(String commaSeparatedNumber : commaSeparatedNumbers) {
            String[] newLineSeparatedArray = commaSeparatedNumber.split(NEWLINE);
            Collections.addAll(nums, newLineSeparatedArray);
        }

        return nums.stream().mapToInt(Integer::parseInt).sum();
    }
}
