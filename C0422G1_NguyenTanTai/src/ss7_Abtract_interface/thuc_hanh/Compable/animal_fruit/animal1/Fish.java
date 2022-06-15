package ss7_Abtract_interface.thuc_hanh.Compable.animal_fruit.animal1;

import ss7_Abtract_interface.thuc_hanh.Compable.animal_fruit.Edible;

public class Fish extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Fish : !!!!!! ";
    }
    @Override
    public String howToEat(){
        return "can be steamed";
    }
}
