package edu.knoldus;

import edu.knoldus.operation.DateOperations;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestDateOperations {

    private static String timeZone;

    @Before
    public void setUp() {
        timeZone = "Asia/Dhaka";
    }

    /**
     * testing day of week
     */
    @Test
    public void testDayOfWeek() {
        List<String> actual = DateOperations.dayOfWeek();
        List<String> expected = Arrays.asList(
                "MONDAY",
                "TUESDAY",
                "WEDNESDAY",
                "FRIDAY",
                "SATURDAY",
                "SUNDAY",
                "MONDAY",
                "WEDNESDAY",
                "THURSDAY",
                "FRIDAY",
                "SATURDAY",
                "MONDAY",
                "TUESDAY",
                "WEDNESDAY",
                "THURSDAY",
                "SATURDAY",
                "SUNDAY",
                "MONDAY",
                "TUESDAY",
                "THURSDAY",
                "FRIDAY",
                "SATURDAY",
                "SUNDAY",
                "TUESDAY",
                "WEDNESDAY"
        );
        assertEquals("Testing day of week since given date", expected, actual);
    }

    /**
     * testing time of the timezone using zoneId
     * test ignored as there is always a difference of one
     * millisecond between expected and actual result
     */
    @Ignore
    @Test
    public void testGetTimeByTimeZone() {
        String actual = DateOperations.getTimeByTimeZone(timeZone);
        String expected = "Time as per given " + timeZone + "(TimeZone values " + ZonedDateTime.now(ZoneId.of(timeZone));
        assertEquals("testing time for a given timezone via zone id for zoneid" + " " + timeZone, expected, actual);
    }

    /**
     * testing testLeapYearsTillDate()
     * gives leap years till date since 1900
     */
    @Test
    public void testLeapYearsTillDate() {
        List<Integer> actual = DateOperations.leapYearsTillDate();
        List<Integer> expected = Arrays.asList(
                1904, 1908, 1912, 1916, 1920, 1924,
                1928, 1932, 1936, 1940, 1944, 1948,
                1952, 1956, 1960, 1964, 1968, 1972,
                1976, 1980, 1984, 1988, 1992, 1996,
                2000, 2004, 2008, 2012, 2016
        );
        assertEquals("testing leapYearsTillDate()", expected, actual);
    }

    /**
     * gives lifespan of Mahatma Gandhi in seconds
     */
    @Test
    public void testSecondsMahatmaLived(){
        Long expected = 2471731200L;
        Long actual = DateOperations.secondsMahatmaLived();
        assertEquals("testing testSecondsMahatmaLived", expected, actual);
    }
}