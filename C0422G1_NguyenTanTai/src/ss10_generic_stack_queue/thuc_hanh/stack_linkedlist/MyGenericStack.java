package ss10_generic_stack_queue.thuc_hanh.stack_linkedlist;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    public LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public static void stackOfString(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations :" + stack.size());
        System.out.println("1.2 Pop elements from stack :");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("\n1.3.Size of stack after pop operations" + stack.size());
    }
    public   static void stackOfInteger(){
        MyGenericStack<Integer>stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("size of stack after push :" + stack.size());
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println(stack.size());
    }

    private T size() {
        return size();
    }
}
