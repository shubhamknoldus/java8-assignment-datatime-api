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
    public static List<String> dayOfWeek() {
        LocalDate bDay = LocalDate.of(1994, 2, 21);
        LocalDate today = LocalDate.now();

        List<LocalDate> dateList = new ArrayList<>();
        while (bDay.getYear() <= today.getYear()) {
            dateList.add(bDay);
            bDay = bDay.plusYears(1);
        }
        return dateList.stream()
                .map(localDate -> localDate.getDayOfWeek().toString()).collect(Collectors.toList());
    }

    public static String getTimeByTimeZone(String timeZone) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(timeZone));
        return "Time as per given " + timeZone + "(TimeZone values " + zonedDateTime;
    }

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

    public static Long secondsMahathmaLived() {
        LocalDateTime mahatmaBornOn = LocalDateTime.parse("1869-10-02T00:00:00");
        LocalDateTime mahatmaDiedOn = LocalDateTime.parse("1948-01-30T00:00:00");
        return Duration.between(mahatmaBornOn, mahatmaDiedOn).toMinutes() * 60;
    }
}
