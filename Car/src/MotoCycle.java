public class MotoCycle extends Vehicle {
    public int wattage ;
    public MotoCycle(){
    }

    public MotoCycle(int id ,String nameOfCar ,int yearOfManufacture ,String Owner ,int wattage){
        super(id,nameOfCar,yearOfManufacture,Owner);
        this.wattage=wattage;

    }

    @Override
    public String toString() {
        return "MotoCycle" +super.toString()+
                "\nwattage :" + wattage +
                "\n";
    }

    @Override
    void gotoBy(){
        System.out.println("2 wheel engine");
    }
}
