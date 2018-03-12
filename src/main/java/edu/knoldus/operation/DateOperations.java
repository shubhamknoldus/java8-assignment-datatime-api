package edu.knoldus.operation;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DateOperations {

    /**
     * @return Day of week for a date of each year since 1994 to till date.
     */
    public static List<String> dayOfWeek() {
        LocalDate birthDay = LocalDate.of(1994, 2, 21);
        LocalDate today = LocalDate.now();

        List<LocalDate> dateList = new ArrayList<>();
        while (birthDay.getYear() <= today.getYear()) {
            dateList.add(birthDay);
            birthDay = birthDay.plusYears(1);
        }
        return dateList.stream()
                .map(localDate -> localDate.getDayOfWeek().toString()).collect(Collectors.toList());
    }

    /**
     * @param timeZone takes time zoneID in string.
     * @return date and time for that zoneId.
     */
    public static String getTimeByTimeZone(String timeZone) {
        ZonedDateTime zonedDateTime;
        zonedDateTime = ZonedDateTime.now(ZoneId.of(timeZone));
        return "Time as per given " + timeZone + "(TimeZone values " + zonedDateTime;
    }

    /**
     * @return leap years from 1900.
     */
    public static List<Integer> leapYearsTillDate() {
        List<LocalDate> leapYearList = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate from = LocalDate.of(1900, 1, 21);
        while (from.getYear() <= today.getYear()) {
            if (from.isLeapYear()) {
                leapYearList.add(from);
            }
            from = from.plusYears(1);
        }
        return leapYearList.stream()
                .map(LocalDate::getYear).collect(Collectors.toList());
    }

    /**
     * @return duration of life span of Mahatma Gandhi in second.
     */
    public static Long secondsMahathmaLived() {
        LocalDateTime mahatmaBornOn = LocalDateTime.parse("1869-10-02T00:00:00");
        LocalDateTime mahatmaDiedOn = LocalDateTime.parse("1948-01-30T00:00:00");
        return Duration.between(mahatmaBornOn, mahatmaDiedOn).toMinutes() * 60;
    }
}
