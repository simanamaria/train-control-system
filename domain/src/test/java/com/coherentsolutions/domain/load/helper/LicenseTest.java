package com.coherentsolutions.domain.load.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LicenseTest {

    @Test
    public void testConstructor() {
        License actualLicense = new License(10);
        actualLicense.setNumber(10);
        assertEquals(10, actualLicense.getNumber());
    }
}

