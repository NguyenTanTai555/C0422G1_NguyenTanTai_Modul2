package ss7_Abtract_interface.thuc_hanh.Compable.animal_fruit.animal1;

import ss7_Abtract_interface.thuc_hanh.Compable.animal_fruit.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : cluck - cluck ";
    }

    @Override
    public String howToEat() {
        return "could be fried ";
    }
}
