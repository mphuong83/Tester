import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import junit.NextDate;
public class NextDateTest {
    @Test
    public void testNextDate() {
        assertEquals("2/1/1812", NextDate.nextDate(1, 1, 1812));
        assertEquals("28/2/1812", NextDate.nextDate(27, 2, 1812));
        assertEquals("29/2/1812", NextDate.nextDate(28, 2, 1812));
        assertEquals("1/3/1812", NextDate.nextDate(29, 2, 1812));
        assertEquals("1/4/1812", NextDate.nextDate(31, 3, 1812));
        assertEquals("2/4/1812", NextDate.nextDate(1, 4, 1812));
        assertEquals("1/5/1812", NextDate.nextDate(30, 4, 1812));
        assertEquals("1/1/2012", NextDate.nextDate(31, 12, 2011));
        assertEquals("2/1/2012", NextDate.nextDate(1, 1, 2012));
        assertEquals("29/2/2012", NextDate.nextDate(28, 2, 2012));
        assertEquals("1/3/2012", NextDate.nextDate(29, 2, 2012));
        assertEquals("1/3/2013", NextDate.nextDate(28, 2, 2013));
        assertEquals("2/3/2013", NextDate.nextDate(1, 3, 2013));
        assertEquals("Invalid Date", NextDate.nextDate(32, 12, 2011));
        assertEquals("Invalid Date", NextDate.nextDate(31, 4, 2012));
        assertEquals("Invalid Date", NextDate.nextDate(29, 2, 1811));
        assertEquals("Invalid Date", NextDate.nextDate(30, 2, 2012));
    }
}
