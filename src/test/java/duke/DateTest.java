package duke;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.DateTimeException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class DateTest {
    @Test
    public void parse_dateString_success() throws Exception {
        assertEquals(
                LocalDate.parse("2020-02-19"),
                Date.parse("19-02-2020"));
        assertEquals(
                LocalDate.parse("1970-01-20"),
                Date.parse("20-01-1970"));
        assertEquals(
                LocalDate.parse("2050-12-31"),
                Date.parse("31-12-2050"));

    }

    @Test
    public void displayFormat_date_success() throws Exception {
        assertEquals(
                "19 Feb 2020",
                Date.displayFormat(LocalDate.parse("2020-02-19")));
        assertEquals(
                "20 May 1970",
                Date.displayFormat(LocalDate.parse("1970-05-20")));
        assertEquals(
                "31 Dec 2050",
                Date.displayFormat(LocalDate.parse("2050-12-31")));

    }

    @Test
    public void storageFormat_date_success() throws Exception {
        assertEquals(
                "19-02-2020",
                Date.storageFormat(LocalDate.parse("2020-02-19")));
        assertEquals(
                "20-05-1970",
                Date.storageFormat(LocalDate.parse("1970-05-20")));
        assertEquals(
                "31-12-2050",
                Date.storageFormat(LocalDate.parse("2050-12-31")));

    }

    @Test
    public void parse_wrongDateFormat_exceptionThrown() throws Exception {
        try {
            assertEquals(
                    "",
                    Date.parse("21/08/2022"));
            fail(); // the test should not reach this line
        } catch (DateTimeException e) {
            assertEquals("Text '21/08/2022' could not be parsed at index 2", e.getMessage());
        }
    }
}