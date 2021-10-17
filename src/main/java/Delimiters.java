import java.util.List;

public class Delimiters {
    private static final String COMMA = ",";
    private static final String NEWLINE = "\n";

    private final List<String> delimiters;

    public Delimiters() {
        this.delimiters = List.of(COMMA, NEWLINE);
    }

    public Delimiters(List<String> delimiters) {
        this.delimiters = delimiters;
    }

    public String regex() {
        StringBuilder sb = new StringBuilder();
        for(String delimiter : delimiters) {
            if(sb.length() != 0) {
                sb.append("|");
            }

            sb.append(delimiter);
        }

        return sb.toString();
    }
}
