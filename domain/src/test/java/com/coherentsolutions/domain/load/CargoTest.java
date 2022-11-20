package com.coherentsolutions.domain.load;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CargoTest {

    @Test
    public void testConstructor() {
        Cargo actualCargo = new Cargo(3);
        actualCargo.setWeight(3);
        String actualToStringResult = actualCargo.toString();
        assertEquals(3, actualCargo.getWeight());
        assertEquals("weight: 3", actualToStringResult);
    }
}

