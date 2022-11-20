package com.coherentsolutions.domain.load.helper;

import com.coherentsolutions.domain.load.helper.License;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LicenseTest {

    @Test
    public void testConstructor() {
        License actualLicense = new License(10);
        actualLicense.setNumber(10);
        assertEquals(10, actualLicense.getNumber());
    }
}

