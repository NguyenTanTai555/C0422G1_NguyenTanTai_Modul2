package ss7_Abtract_interface.thuc_hanh.Compable.animal_fruit.animal1;

import ss7_Abtract_interface.thuc_hanh.Compable.animal_fruit.Edible;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        animals[2] = new Fish();
        for (Animal animal:animals) {
            System.out.println(animal.makeSound());
           if (animal instanceof Chicken){
               Edible edible = (Chicken) animal;
               System.out.println(edible.howToEat());
           } if (animal instanceof Fish){
               Edible edible = (Fish)animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
