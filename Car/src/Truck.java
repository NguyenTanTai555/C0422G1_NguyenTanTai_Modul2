public class Truck extends Vehicle {
    private double grossTon;
    public Truck(){

    }

    public Truck(int id, String nameOfCar, int yearOfManufacture, String owner, double grossTon) {
        super(id, nameOfCar, yearOfManufacture, owner);
        this.grossTon = grossTon;
    }

    @Override
    public String toString() {
        return "Truck"+ super.toString()+
                "\ngrossTon :" + grossTon +"\n";
    }


}
