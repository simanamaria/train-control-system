package com.coherentsolutions.domain.carriage.categories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.coherentsolutions.domain.carriage.Carriage;
import com.coherentsolutions.domain.carriage.CarriageHelper;
import com.coherentsolutions.domain.load.Cargo;
import com.coherentsolutions.domain.load.Driver;
import com.coherentsolutions.domain.load.User;
import com.coherentsolutions.domain.load.helper.License;

import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class DriverCarriageTest {

    @Test
    public void numberOfDrivers() {
        User driver1 = new Driver("A", "A", 20, new License(1));
        User driver2 = new Driver("B", "B", 20, new License(2));
        Carriage carriage = new DriverCarriage(1);
        carriage.addLoad(driver1);
        carriage.addLoad(driver2);
        int expected = ((DriverCarriage) carriage).getDriverList().size();

        int actual = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void OfAge() {
        User driver = new Driver("A", "A", 18, new License(1));
        Carriage carriage = new DriverCarriage(5);
        carriage.addLoad(driver);
        int expected = driver.getAge();
        Assert.assertTrue(expected >= 18);
    }

    @Test
    public void testConstructor() {
        DriverCarriage actualDriverCarriage = new DriverCarriage(1);
        assertEquals("Driver carriage: 1driver: []", actualDriverCarriage.toString());
        assertTrue(actualDriverCarriage.driverList.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DriverCarriage#DriverCarriage(int)}
     *   <li>{@link DriverCarriage#getDriverList()}
     * </ul>
     */
    @Test
    public void testConstructor2() {
        DriverCarriage actualDriverCarriage = new DriverCarriage(1);
        List<User> expectedDriverList = actualDriverCarriage.driverList;
        assertSame(expectedDriverList, actualDriverCarriage.getDriverList());
    }

    @Test
    public void testAddLoad() {
        DriverCarriage driverCarriage = new DriverCarriage(1);
        Cargo cargo = new Cargo(3);
        driverCarriage.addLoad(cargo);
        assertEquals(3, cargo.getWeight());
        assertTrue(driverCarriage.driverList.isEmpty());
    }

    @Test
    public void testAddLoad2() {
        DriverCarriage driverCarriage = new DriverCarriage(1);
        driverCarriage.addLoad(new Driver("Jane", "Doe", 18, new License(10)));
        assertEquals(1, driverCarriage.driverList.size());
    }

    @Test
    public void testEquals() {
        assertNotEquals(new DriverCarriage(1), null);
        assertNotEquals(new DriverCarriage(1), "Different type to DriverCarriage");
    }

    @Test
    public void testEquals2() {
        DriverCarriage driverCarriage = new DriverCarriage(1);
        assertEquals(driverCarriage, driverCarriage);
        int expectedHashCodeResult = driverCarriage.hashCode();
        assertEquals(expectedHashCodeResult, driverCarriage.hashCode());
    }

    @Test
    public void testEquals3() {
        DriverCarriage driverCarriage = new DriverCarriage(1);
        DriverCarriage driverCarriage1 = new DriverCarriage(1);
        assertEquals(driverCarriage, driverCarriage1);
        int expectedHashCodeResult = driverCarriage.hashCode();
        assertEquals(expectedHashCodeResult, driverCarriage1.hashCode());
    }

    @Test
    public void testEquals4() {
        DriverCarriage driverCarriage = new DriverCarriage(10);
        assertNotEquals(driverCarriage, new DriverCarriage(1));
    }
}

