public class Cars extends Vehicle {
    public int numberOfSeats;
    public String vehicleType;

    public Cars(){}


    public Cars(int numberOfSeats, String vehicleType) {
        this.numberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }

    public Cars(int id, String nameOfCar, int yearOfManufacture, String owner, int numberOfSeats, String vehicleType) {
        super(id, nameOfCar, yearOfManufacture, owner);
        this.numberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return  "Cars" +super.toString()+
                "\nnumberOfSeats :" + numberOfSeats
                + "\nvehicleType :'" + vehicleType +"\n"
                ;
    }

    @Override
    void gotoBy() {
        System.out.println(" 4 wheel engine ");
    }

}
