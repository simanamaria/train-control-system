package com.coherentsolutions.domain.load;

import com.coherentsolutions.domain.load.Cargo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

