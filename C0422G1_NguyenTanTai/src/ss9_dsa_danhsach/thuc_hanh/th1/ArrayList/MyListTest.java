package ss9_dsa_danhsach.thuc_hanh.th1.ArrayList;


public class MyListTest {
    public static void main(String[] args) {
        MyList<String> listInteger = new MyList<>();
        listInteger.add("Tai");
        listInteger.add("Long");
        listInteger.add("Son");
        listInteger.add("Tam");
        listInteger.add("Tri");
        System.out.print("{");
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.println(listInteger.get(i));
        }
    }
}
