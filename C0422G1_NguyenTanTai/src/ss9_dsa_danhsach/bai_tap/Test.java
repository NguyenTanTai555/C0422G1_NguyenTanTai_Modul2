package ss9_dsa_danhsach.bai_tap;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyArrayList<Integer> aLo = new MyArrayList<>(5);
        aLo.add(0,1);
        aLo.add(1,2);
        aLo.add(2,3);
        aLo.add(3,4);
        aLo.add(4,5);
        System.out.println(aLo.get(3));
        aLo.reSize();
        for (int i = 0; i < aLo.size(); i++) {
            System.out.println(aLo.get(i));
        }
        aLo.indexOf(4);
        Arrays.toString(aLo.elements);
    }
}
