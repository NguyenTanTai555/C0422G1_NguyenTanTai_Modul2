package model;

public class House extends Facility{
    String houseStandard ;
    int numberOfFloors;
    public House(){}

    public House(String houseStandard, int numberOfFloors) {
        this.houseStandard = houseStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String nameService, double price, int numberOfPeople, String rentalType, String houseStandard, int numberOfFloors) {
        super(nameService, price, numberOfPeople, rentalType);
        this.houseStandard = houseStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getHouseStandard() {
        return houseStandard;
    }

    public void setHouseStandard(String houseStandard) {
        this.houseStandard = houseStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House" + super.toString() +
                "\nhouseStandard='" + houseStandard +
                "\nnumberOfFloors=" + numberOfFloors ;
    }
}
