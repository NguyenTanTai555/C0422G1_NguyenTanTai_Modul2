package models;

import models.Vehicle;

public class MotoCycle extends Vehicle {
    private int wattage ;
    public MotoCycle(){
    }

    public MotoCycle(int id ,String nameOfCar ,int yearOfManufacture ,String owner ,int wattage){
        super(id,nameOfCar,yearOfManufacture,owner);
        this.wattage=wattage;

    }

    @Override
    public String toString() {
        return "models.MotoCycle" +super.toString()+
                "\nwattage :" + wattage +
                "\n";
    }

}
