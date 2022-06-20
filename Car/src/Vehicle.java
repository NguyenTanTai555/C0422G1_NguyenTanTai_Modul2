public abstract class Vehicle {
    public int id;
    public String nameOfCar ;
    public int yearOfManufacture;
    public String owner;
    public Vehicle(){
    }

    public Vehicle(int id, String nameOfCar, int yearOfManufacture, String owner) {
        this.id = id;
        this.nameOfCar = nameOfCar;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public void setNameOfCar(String nameOfCar) {
        this.nameOfCar = nameOfCar;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        owner = owner;
    }
    @Override
    public String toString() {
        return "\nid :" + id
                + "\nnameOfCar : '" + nameOfCar
                + "\nyear  :" + yearOfManufacture
                + "\nOwner :'" + owner;
    }
}

