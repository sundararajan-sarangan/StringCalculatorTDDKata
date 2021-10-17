import java.util.Arrays;

public class Adder {
    private final Delimiters delimiters;

    public Adder(Delimiters delimiters) {
        this.delimiters = delimiters;
    }

    public int sumOf(String s) throws Exception {
        int[] numbers = Arrays.stream(s.split(delimiters.regex())).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for(int number : numbers) {
            if(number < 0) {
                throw new Exception("negatives not allowed " + number);
            }
            sum = sum + number;
        }

        return sum;
    }
}
