package com.coherentsolutions.consoleApp.main;

import com.coherentsolution.train.TrainLinkedList;
import com.coherentsolutions.domain.carriage.Carriage;
import com.coherentsolutions.domain.carriage.categories.CargoCarriage;
import com.coherentsolutions.domain.carriage.categories.DriverCarriage;
import com.coherentsolutions.domain.carriage.categories.PassengerCarriage;
import com.coherentsolutions.domain.load.Cargo;
import com.coherentsolutions.domain.load.Driver;
import com.coherentsolutions.domain.load.Passenger;
import com.coherentsolutions.domain.load.User;
import com.coherentsolutions.domain.load.helper.License;
import com.coherentsolutions.domain.load.helper.Ticket;

public class CompanyApp {
    public static void main(String[] args) {
        User passenger = new Passenger("Jane", "Doe", 11, new Ticket(1,2));
        User driver = new Driver("John", "Doe", 27, new License(1));
        Cargo cargo = new Cargo(100);

        Carriage passengerCarriage = new PassengerCarriage(10,2);
        passengerCarriage.addLoad(passenger);

        Carriage driverCarriage = new DriverCarriage(1);
        driverCarriage.addLoad(driver);

        Carriage cargoCarriage = new CargoCarriage(400);
        cargoCarriage.addLoad(cargo);

        TrainLinkedList<Carriage> trainLinkedList = new TrainLinkedList<>(1);
        trainLinkedList.addHead(driverCarriage);
        trainLinkedList.insert(1, passengerCarriage);
        trainLinkedList.addTail(cargoCarriage);
        trainLinkedList.print();


    }
}
