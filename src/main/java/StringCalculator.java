public class StringCalculator {
    public int Add(String s) {
        if (isNullOrEmpty(s)) {
            return 0;
        }

        String[] nums;
        if(s.contains("\n")) {
            nums = s.split("\n");
        } else {
            nums = s.split(",");
        }

        int sum = 0;
        for (String num : nums) {
            sum = sum + Integer.parseInt(num);
        }

        return sum;
    }

    private boolean isNullOrEmpty(String s) {
        return s == null || s.equals("");
    }
}
