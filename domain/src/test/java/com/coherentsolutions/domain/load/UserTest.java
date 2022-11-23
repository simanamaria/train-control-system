package com.coherentsolutions.domain.load;

import com.coherentsolutions.domain.load.Driver;
import com.coherentsolutions.domain.load.helper.License;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void testGetAge() {
        assertEquals(1, (new Driver("Jane", "Doe", 1, new License(10))).getAge());
    }


    @Test
    public void testSetAge() {
        Driver driver = new Driver("Jane", "Doe", 1, new License(10));
        driver.setAge(1);
        assertEquals(1, driver.getAge());
    }

    @Test
    public void testToString() {
        assertEquals("Jane Doe age: 1", (new Driver("Jane", "Doe", 1, new License(10))).toString());
    }
}

