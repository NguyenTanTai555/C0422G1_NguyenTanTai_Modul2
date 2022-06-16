package ss5_AccessModifier_Staticmethod.thuc_hanh;

public class Student {
    public class Cent{
        private String name ;

        public Cent(String name) {
            this.name = name;
        }
    }
    Cent c = new Cent("hello");
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

    public static void main(String[] args) {
        System.out.println("hello");

    }
}

