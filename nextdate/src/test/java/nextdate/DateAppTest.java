package nextdate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 * Unit test for DateApp class
 * Test cases are in CSV file
 */
public class DateAppTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/tests.csv", numLinesToSkip = 1)
    public void executeCsvTests(int day, int month, int year, String expected) {
        DateApp dateApp = new DateApp(year, month, day);
        assertEquals(expected, dateApp.NextDate());
    }
}
