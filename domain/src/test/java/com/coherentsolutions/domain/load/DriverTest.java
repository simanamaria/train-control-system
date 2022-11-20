package com.coherentsolutions.domain.load;

import com.coherentsolutions.domain.load.Driver;
import com.coherentsolutions.domain.load.helper.License;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class DriverTest {

    @Test
    public void testConstructor() {
        Driver actualDriver = new Driver("Jane", "Doe", 1, new License(10));
        License license = new License(10);
        actualDriver.setLicense(license);
        assertSame(license, actualDriver.getLicense());
    }
}

