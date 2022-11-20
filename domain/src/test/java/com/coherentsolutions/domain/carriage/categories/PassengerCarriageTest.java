package com.coherentsolutions.domain.carriage.categories;

import com.coherentsolutions.domain.carriage.categories.PassengerCarriage;
import com.coherentsolutions.domain.load.Cargo;
import com.coherentsolutions.domain.load.Passenger;
import com.coherentsolutions.domain.load.User;
import com.coherentsolutions.domain.load.helper.Ticket;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class PassengerCarriageTest {
    @Test
    public void testConstructor() {
        PassengerCarriage actualPassengerCarriage = new PassengerCarriage(10, 10);
        actualPassengerCarriage.setNumber(10);
        actualPassengerCarriage.setNumberOfSeats(10);
        HashMap<Integer, User> integerUserMap = new HashMap<>();
        actualPassengerCarriage.setPassengerMap(integerUserMap);
        String actualToStringResult = actualPassengerCarriage.toString();
        assertEquals(10, actualPassengerCarriage.getNumber());
        assertEquals(10, actualPassengerCarriage.getNumberOfSeats());
        assertSame(integerUserMap, actualPassengerCarriage.getPassengerMap());
        assertEquals("Passenger carriage number: 10 number of seats: 10passengers: {}", actualToStringResult);
    }

    @Test
    public void testAddLoad() {
        PassengerCarriage passengerCarriage = new PassengerCarriage(10, 10);
        Cargo cargo = new Cargo(3);
        passengerCarriage.addLoad(cargo);
        assertEquals(3, cargo.getWeight());
        assertEquals(10, passengerCarriage.getNumber());
        assertTrue(passengerCarriage.getPassengerMap().isEmpty());
        assertEquals(10, passengerCarriage.getNumberOfSeats());
    }

    @Test
    public void testAddLoad2() {
        PassengerCarriage passengerCarriage = new PassengerCarriage(10, 10);
        passengerCarriage.addLoad(new Passenger("Jane", "Doe", 1, new Ticket(10, 10)));
        assertEquals(1, passengerCarriage.getPassengerMap().size());
    }

    @Test
    public void testAddLoad3() {
        PassengerCarriage passengerCarriage = new PassengerCarriage(10, 0);
        Ticket ticket = new Ticket(10, 10);

        Passenger passenger = new Passenger("Jane", "Doe", 1, ticket);

        passengerCarriage.addLoad(passenger);
        assertEquals(1, passenger.getAge());
        assertSame(ticket, passenger.getTicket());
        assertEquals(10, passengerCarriage.getNumber());
        assertTrue(passengerCarriage.getPassengerMap().isEmpty());
        assertEquals(0, passengerCarriage.getNumberOfSeats());
    }

    @Test
    public void testEquals() {
        assertNotEquals(new PassengerCarriage(10, 10), null);
        assertNotEquals(new PassengerCarriage(10, 10), "Different type to PassengerCarriage");
    }

    @Test
    public void testEquals2() {
        PassengerCarriage passengerCarriage = new PassengerCarriage(10, 10);
        assertEquals(passengerCarriage, passengerCarriage);
        int expectedHashCodeResult = passengerCarriage.hashCode();
        assertEquals(expectedHashCodeResult, passengerCarriage.hashCode());
    }

    @Test
    public void testEquals3() {
        PassengerCarriage passengerCarriage = new PassengerCarriage(10, 10);
        PassengerCarriage passengerCarriage1 = new PassengerCarriage(10, 10);

        assertEquals(passengerCarriage, passengerCarriage1);
        int expectedHashCodeResult = passengerCarriage.hashCode();
        assertEquals(expectedHashCodeResult, passengerCarriage1.hashCode());
    }

    @Test
    public void testEquals4() {
        PassengerCarriage passengerCarriage = new PassengerCarriage(1, 10);
        assertNotEquals(passengerCarriage, new PassengerCarriage(10, 10));
    }

    @Test
    public void testEquals5() {
        PassengerCarriage passengerCarriage = new PassengerCarriage(10, 1);
        assertNotEquals(passengerCarriage, new PassengerCarriage(10, 10));
    }
}

