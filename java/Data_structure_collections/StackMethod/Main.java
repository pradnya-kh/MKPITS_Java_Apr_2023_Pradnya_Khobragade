package StackMethod;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.add(300);
        stack.add(500);
        stack.add(600);
        System.out.println(stack);
        //System.out.println(stack.pop());
        System.out.println(stack.capacity());
        System.out.println(stack.peek());
        System.out.println(stack.search(700));


    }
}
