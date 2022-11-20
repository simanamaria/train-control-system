package com.coherentsolutions.domain.carriage.categories;

import com.coherentsolutions.domain.carriage.categories.CargoCarriage;
import com.coherentsolutions.domain.load.Cargo;
import com.coherentsolutions.domain.load.Driver;
import com.coherentsolutions.domain.load.helper.License;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CargoCarriageTest {

    @Test
    public void testConstructor() {
        CargoCarriage actualCargoCarriage = new CargoCarriage(3);
        ArrayList<Cargo> cargoList = new ArrayList<>();
        actualCargoCarriage.setCargoList(cargoList);
        actualCargoCarriage.setWeightLimit(3);
        String actualToStringResult = actualCargoCarriage.toString();
        assertSame(cargoList, actualCargoCarriage.getCargoList());
        assertEquals(3, actualCargoCarriage.getWeightLimit());
        assertEquals("Weight limit for Cargo carriage is: 3. The cargo is[]", actualToStringResult);
    }

    @Test
    public void testAddLoad() {
        CargoCarriage cargoCarriage = new CargoCarriage(3);
        cargoCarriage.addLoad(new Cargo(3));
        assertEquals(1, cargoCarriage.getCargoList().size());
    }

    @Test
    public void testAddLoad2() {
        CargoCarriage cargoCarriage = new CargoCarriage(1);
        Cargo cargo = new Cargo(3);
        cargoCarriage.addLoad(cargo);
        assertEquals(3, cargo.getWeight());
        assertTrue(cargoCarriage.getCargoList().isEmpty());
        assertEquals(1, cargoCarriage.getWeightLimit());
    }

    @Test
    public void testAddLoad3() {
        CargoCarriage cargoCarriage = new CargoCarriage(3);
        cargoCarriage.addLoad(new Cargo(3));
        Cargo cargo = new Cargo(3);
        cargoCarriage.addLoad(cargo);
        assertEquals(3, cargo.getWeight());
        assertEquals(1, cargoCarriage.getCargoList().size());
        assertEquals(3, cargoCarriage.getWeightLimit());
    }

    @Test
    public void testAddLoad4() {
        CargoCarriage cargoCarriage = new CargoCarriage(3);
        License license = new License(10);
        Driver driver = new Driver("Jane", "Doe", 1, license);

        cargoCarriage.addLoad(driver);
        assertEquals(1, driver.getAge());
        assertSame(license, driver.getLicense());
        assertTrue(cargoCarriage.getCargoList().isEmpty());
        assertEquals(3, cargoCarriage.getWeightLimit());
    }

    @Test
    public void testDeleteCargo() {
        CargoCarriage cargoCarriage = new CargoCarriage(3);
        cargoCarriage.deleteCargo();
        assertTrue(cargoCarriage.getCargoList().isEmpty());
    }

    @Test
    public void testEquals() {
        assertNotEquals(new CargoCarriage(3), null);
        assertNotEquals(new CargoCarriage(3), "Different type to CargoCarriage");
    }

    @Test
    public void testEquals2() {
        CargoCarriage cargoCarriage = new CargoCarriage(3);
        assertEquals(cargoCarriage, cargoCarriage);
        int expectedHashCodeResult = cargoCarriage.hashCode();
        assertEquals(expectedHashCodeResult, cargoCarriage.hashCode());
    }

    @Test
    public void testEquals3() {
        CargoCarriage cargoCarriage = new CargoCarriage(3);
        CargoCarriage cargoCarriage1 = new CargoCarriage(3);
        assertEquals(cargoCarriage, cargoCarriage1);
        int expectedHashCodeResult = cargoCarriage.hashCode();
        assertEquals(expectedHashCodeResult, cargoCarriage1.hashCode());
    }

    @Test
    public void testEquals4() {
        CargoCarriage cargoCarriage = new CargoCarriage(1);
        assertNotEquals(cargoCarriage, new CargoCarriage(3));
    }

    @Test
    public void testEquals5() {
        CargoCarriage cargoCarriage = new CargoCarriage(3);
        cargoCarriage.addLoad(new Cargo(3));
        assertNotEquals(cargoCarriage, new CargoCarriage(3));
    }
}

