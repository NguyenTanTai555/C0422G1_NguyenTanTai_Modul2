package ss5_AccessModifier_Staticmethod.thuc_hanh;

public class Car {
    private String name ;
    private String engine ;
    public static int numberOfCar;

    public Car(String name , String engine){
        this.name = name ;
        this.engine = engine;
        numberOfCar++;
    }
    static {
        System.out.println("Hello World");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void display(){
        System.out.println("Name :" + getName() + "\n" + "Engine :" + getEngine());
        System.out.println(Car.numberOfCar);
    }
}
