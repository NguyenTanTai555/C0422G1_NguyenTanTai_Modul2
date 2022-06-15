package ss7_Abtract_interface.thuc_hanh.Compable.animal_fruit.fruit;

import ss7_Abtract_interface.thuc_hanh.Compable.animal_fruit.Edible;

public class Fruit implements Edible {
    @Override
    public String howToEat() {
        return "eat directly";
    }
}
