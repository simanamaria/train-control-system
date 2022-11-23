package com.coherentsolutions.domain.carriage.categories;

import com.coherentsolutions.domain.carriage.CarriageHelper;
import com.coherentsolutions.domain.carriage.Carriage;
import com.coherentsolutions.domain.load.Cargo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

public class CargoCarriage implements Carriage{

    private int weightLimit;
    private List<Cargo> cargoList = new ArrayList<>();
    private static final Logger log = Logger.getLogger(CargoCarriage.class.getName());

    public CargoCarriage(int weightLimit) {
        this.weightLimit = weightLimit;
    }

    public int getWeightLimit() {
        return weightLimit;
    }

    @Override
    public void addLoad(CarriageHelper helper) {
        if (helper.getClass().getName().equals("com.coherentsolutions.domain.load.Cargo")) {
            int count = 0;
            for (Cargo element : cargoList){
                count += element.getWeight();
            }
            if (this.getWeightLimit() - count >= ((Cargo) helper).getWeight()) {
                cargoList.add((Cargo) helper);
                log.info("Weight: " + ((Cargo) helper).getWeight());
            } else {
                log.warning("Too much weight");
            }
        } else log.warning("Incompatible types");
    }

    public void deleteCargo(){
        cargoList.clear();
        log.info("Removed cargo");
    }

    public void setWeightLimit(int weightLimit) {
        this.weightLimit = weightLimit;
    }

    public List<Cargo> getCargoList() {
        return cargoList;
    }

    public void setCargoList(List<Cargo> cargoList) {
        this.cargoList = cargoList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weightLimit, cargoList);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CargoCarriage carriage = (CargoCarriage) obj;
        return weightLimit == carriage.weightLimit && Objects.equals(cargoList, carriage.cargoList);
    }

    @Override
    public String toString() {
        return "Weight limit for Cargo carriage is: " + weightLimit + ". The cargo is" + cargoList;
    }
}
