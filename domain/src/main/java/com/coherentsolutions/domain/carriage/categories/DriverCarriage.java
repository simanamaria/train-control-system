package com.coherentsolutions.domain.carriage.categories;

import com.coherentsolutions.domain.carriage.CarriageHelper;
import com.coherentsolutions.domain.carriage.Carriage;
import com.coherentsolutions.domain.load.Driver;
import com.coherentsolutions.domain.load.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

public class DriverCarriage implements Carriage {

    private int idNumber;
    List<User> driverList = new ArrayList<>();

    public DriverCarriage(int idNumber) {
        this.idNumber = idNumber;
    }
    private static final Logger log = Logger.getLogger(DriverCarriage.class.getName());


    @Override
    public void addLoad(CarriageHelper driver) {
        if (driver.getClass().getName().equals("com.coherentsolutions.domain.load.Driver")){
            if (driverList.isEmpty()){
                if (((User) driver).getAge()>= 18){
                    driverList.add((Driver) driver);
                    log.info("Driver: " + driver);
                } else {log.warning("Driver not of age: " + ((User) driver).getAge());}   //!
            } else {log.warning("Not more than one driver");}   //!
        } else {log.warning("Not valid driver");
    }
    }

    public List<User> getDriverList() {
        return driverList;
    }

    @Override
    public String toString() {
        return "Driver carriage: " + idNumber + "driver: " + driverList;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null|| getClass() != obj.getClass()) return false;
        DriverCarriage driverCarriage = (DriverCarriage) obj;
        return idNumber == driverCarriage.idNumber && Objects.equals(driverList, driverCarriage.driverList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNumber, driverList);
    }
}