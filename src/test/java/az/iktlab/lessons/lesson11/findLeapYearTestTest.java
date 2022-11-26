package az.iktlab.lessons.lesson11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class findLeapYearTestTest {

    @Test
    public void findLeapTest() {
        Assertions.assertEquals("Not a leap year", leapYear.findLeapYear(1000));
        Assert.assertEquals("Not a leap year",leapYear.findLeapYear(1100));
        Assert.assertEquals("Leap year",leapYear.findLeapYear(1600));
        Assert.assertEquals("Not a leap year",leapYear.findLeapYear(3458));
        Assert.assertEquals("Leap year",leapYear.findLeapYear(3456));
        Assert.assertEquals("Leap year",leapYear.findLeapYear(2000));
        Assert.assertEquals("Not a leap year",leapYear.findLeapYear(1230));
        Assert.assertEquals("Leap year",leapYear.findLeapYear(1568));
        Assert.assertEquals("Not a leap year",leapYear.findLeapYear(2018));
        Assert.assertEquals("Not a leap year",leapYear.findLeapYear(2022));
        Assert.assertEquals("Leap year",leapYear.findLeapYear(3200));
        Assert.assertEquals("Leap year",leapYear.findLeapYear(1976));
    }
}
