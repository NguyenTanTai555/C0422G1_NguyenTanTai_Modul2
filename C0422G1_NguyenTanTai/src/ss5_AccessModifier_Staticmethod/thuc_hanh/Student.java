package ss5_AccessModifier_Staticmethod.thuc_hanh;

public class Student {
    private int rollno;
    private String name ;
    private static String college = "BBDIT";
    Student(int r , String n ) {
        rollno = r ;
        name = n;
    }
    static void changer(){
        college = " CODE GYM " ;
    }
    void display(){
        System.out.println(rollno +" "+name + " " + college);
    }
}
