import java.util.regex.*;

public class LogLevels {

    public static String message(String logLine) {
        Pattern pattern = Pattern.compile(":\\s*(.+)");
        Matcher matcher = pattern.matcher(logLine);

        if (matcher.find()) {
            return matcher.group(1).trim();
        }

        throw new IllegalStateException("No match found in log line: " + logLine);
    }

    public static String logLevel(String logLine) {
        Pattern pattern = Pattern.compile("\\[(.*?)]");
        Matcher matcher = pattern.matcher(logLine);

        if (matcher.find()) {
            return matcher.group(1).toLowerCase();
        }

        throw new IllegalStateException("No match found in log line: " + logLine);
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
