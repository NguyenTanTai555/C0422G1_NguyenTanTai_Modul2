package ss9_dsa_danhsach.bai_tap;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void reSize(){
        int newSize = elements.length*2 ;
        elements = Arrays.copyOf(elements,newSize);
    }

    public MyArrayList(int capacity) {
    elements = new Object[capacity];
    }

    void add(int index, E newElement) {
        if (index >= 0 && index < elements.length) {
            for (int i = elements.length-1; i > index ; i--) {
                elements[i] = elements[i-1];
            }
            elements[index] = newElement ;
        } else if (size == elements.length){
            reSize();
        }
        elements[size++] = newElement ;
    }
    public int indexOf(E o){
        if (o == null){
            for (int i = 0; i < size; i++) {
                if (elements[i]==null){
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i]));
                return i;
            }
        }
        return -1 ;
    }
    private boolean contains(E o ){
        return indexOf(o) > 0;
    }

    void remove(int index) {
        while (index < elements.length - 1) {
            elements[index] = elements[index + 1];
            index++;
        }
        elements[elements.length - 1] = null;
    }

    public int size() {
        return size;
    }
    public void clear(){
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null ;
        }
        size = 0 ;
    }
    public E get(int index){
        return (E) elements[index];
    }
}
