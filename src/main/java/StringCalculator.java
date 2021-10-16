public class StringCalculator {
    public int Add(String numbers) {
        if (isNullOrEmpty(numbers)) {
            return 0;
        }

        return new Adder().sumOf(numbers);
    }

    private boolean isNullOrEmpty(String s) {
        return s == null || s.equals("");
    }
}
