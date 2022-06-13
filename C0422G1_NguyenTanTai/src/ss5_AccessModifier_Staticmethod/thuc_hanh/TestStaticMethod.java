package ss5_AccessModifier_Staticmethod.thuc_hanh;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.changer();
        Student s1 = new Student(1,"Cuong ");
        Student s2 = new Student(2, "Duc");
        Student s3 = new Student(3,"Bao");
        s1.display();
        s2.display();
        s3.display();
    }
}
