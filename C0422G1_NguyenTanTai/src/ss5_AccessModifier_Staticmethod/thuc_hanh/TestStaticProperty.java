package ss5_AccessModifier_Staticmethod.thuc_hanh;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car honda = new Car("sirius","Ron92");
        honda.display();
        honda.setName("Dream");
        honda.setEngine("Ron95");
        honda.display();
    }
}
