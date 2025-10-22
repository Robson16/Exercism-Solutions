import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        String pattern = "M/d/yyyy HH:mm:ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        return LocalDateTime.parse(appointmentDateDescription, formatter);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();

        return hour >= 12 && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        String pattern = "EEEE, MMMM d, yyyy, 'at' h:mm a.";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, Locale.US);
        String formattedDate = appointmentDate.format(formatter);

        return "You have an appointment on " + formattedDate;
    }

    public LocalDate getAnniversaryDate() {
        int currentYear = LocalDate.now().getYear();

        return LocalDate.of(currentYear, 9, 15);
    }
}
