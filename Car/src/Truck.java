public class Truck extends Vehicle {
    public double grossTon;
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

    @Override
    void gotoBy(){
        System.out.println("4 wheel engine");
    }
}
