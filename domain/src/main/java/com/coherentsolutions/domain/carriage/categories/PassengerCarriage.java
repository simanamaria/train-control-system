package com.coherentsolutions.domain.carriage.categories;

import com.coherentsolutions.domain.carriage.CarriageHelper;
import com.coherentsolutions.domain.carriage.Carriage;
import com.coherentsolutions.domain.load.Passenger;
import com.coherentsolutions.domain.load.User;

import java.util.*;
import java.util.logging.Logger;

public class PassengerCarriage implements Carriage {

    private int number;
    private int numberOfSeats;
    private Map<Integer, User> passengerMap = new HashMap<>();
    private static final Logger log = Logger.getLogger(PassengerCarriage.class.getName());

    public PassengerCarriage(int number, int numberOfSeats) {
        this.number = number;
        this.numberOfSeats = numberOfSeats;
    }



    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void addLoad(CarriageHelper passenger) {
        if (passenger.getClass().getName().equals("com.coherentsolutions.domain.load.Passenger")){
            if (passengerMap.size() < this.getNumberOfSeats()){
                if (!passengerMap.containsKey((((Passenger) passenger).getTicket().getSeatNumber()))){
                    passengerMap.put(((Passenger) passenger).getTicket().getSeatNumber(), (Passenger) passenger);
                    log.info("Passenger " + passenger + " has the seat: " + ((Passenger) passenger).getTicket().getSeatNumber());
                } else log.warning(((Passenger) passenger).getTicket().getSeatNumber() + " seat taken");
            } else log.warning("No available seats");
        } else log.warning("Not valid passenger");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Map<Integer, User> getPassengerMap() {
        return passengerMap;
    }

    public void setPassengerMap(Map<Integer, User> passengerMap) {
        this.passengerMap = passengerMap;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, numberOfSeats, passengerMap);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PassengerCarriage passengerCarriage = (PassengerCarriage) obj;
        return number == passengerCarriage.number && numberOfSeats == passengerCarriage.numberOfSeats && Objects.equals(passengerMap, passengerCarriage.passengerMap);
    }

    @Override
    public String toString() {
        return "Passenger carriage number: " + number + " number of seats: " + numberOfSeats + "passengers: " + passengerMap;
    }
}