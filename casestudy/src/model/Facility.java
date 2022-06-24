package model;

public abstract class Facility {
    String nameService;
    double price;
    int numberOfPeople;
    String rentalType;

    public Facility() {
    }

    public Facility(String nameService, double price, int numberOfPeople, String rentalType) {
        this.nameService = nameService;
        this.price = price;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility" +
                "\nnameService :" + nameService +
                "\nprice :" + price +
                "\nnumberOfPeople :" + numberOfPeople +
                "\nrentalType :" + rentalType;
    }
}
