package ss9_dsa_danhsach.thuc_hanh.th2.LinKedList;

public class TestLinkedList {
    public static void main(String[] args) {
        System.out.println("===== TESTING =====");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst(14);
        ll.add(3,9);
        ll.printList();
    }
}
