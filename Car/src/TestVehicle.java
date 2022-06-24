import models.Cars;
import models.MotoCycle;
import models.Truck;
import models.Vehicle;

import java.util.Arrays;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle[]vehicles=new Vehicle[3];
        vehicles[0] = new Cars(1234,"Mercedes C200",1995,"Mercedes",5,"luxury Car");
        vehicles[1] = new MotoCycle(8888,"dream",1990,"Honda",100);
        vehicles[2] = new Truck(2222,"Hyundai",1995,"park gi sung", 5);
        System.out.println(Arrays.toString(vehicles));
    }
}
