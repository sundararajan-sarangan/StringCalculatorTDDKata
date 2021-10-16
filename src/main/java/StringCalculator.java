import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringCalculator {

    private static final String COMMA = ",";
    private static final String NEWLINE = "\n";

    public int Add(String s) {
        if (isNullOrEmpty(s)) {
            return 0;
        }

        List<Integer> nums = extractNumbersFrom(s);
        return sumOf(nums);
    }

    private boolean isNullOrEmpty(String s) {
        return s == null || s.equals("");
    }

    private List<Integer> extractNumbersFrom(String s) {
        String[] commaSeparatedNumbers = s.split(COMMA);
        List<String> nums = new ArrayList<>();
        for(String commaSeparatedNumber : commaSeparatedNumbers) {
            String[] newLineSeparatedArray = commaSeparatedNumber.split(NEWLINE);
            Collections.addAll(nums, newLineSeparatedArray);
        }

        List<Integer> intNums = new ArrayList<>();
        for(String num : nums) {
            intNums.add(toInt(num));
        }

        return intNums;
    }

    private int toInt(String num) {
        return Integer.parseInt(num);
    }

    private int sumOf(List<Integer> nums) {
        return nums.stream().mapToInt(Integer::intValue).sum();
    }
}
