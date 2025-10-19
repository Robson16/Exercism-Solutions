public class LogLine {

    private final String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String level = this.logLine.substring(this.logLine.indexOf("[") + 1 , this.logLine.indexOf("]"));

        switch (level) {
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        LogLevel level = this.getLogLevel();
        String message = this.logLine.substring(this.logLine.indexOf("]") + 2).trim();

        return String.format("%s:%s", level.getSeverity(), message);
    }
}
