package ss5_AccessModifier_Staticmethod.bai_tap;

public class Student {
    private String name = "john" ;
    private String classes ="C04";
    public static void Student(){
    }

    public String getName() {
        return name;
    }

     public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    void display(){
        System.out.println("Name :" + getName());
        System.out.println("Classes :" + getClasses());
    }
}
