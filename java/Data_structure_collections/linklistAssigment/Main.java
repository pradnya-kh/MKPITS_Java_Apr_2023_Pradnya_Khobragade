package linklistAssigment;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(60);

        System.out.println("-----append the specified element to the end of a linked list.-----");
        linkedList.addLast(70);
        System.out.println(linkedList);

        System.out.println("iterate through all elements in a linked list.");
        Iterator iterator= linkedList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("--iterate through all elements in a linked list starting at the specified position.---");
        Iterator iterator1=linkedList.listIterator(2);
        while (iterator1.hasNext())
        {
            System.out.println(iterator1.next());
        }

        System.out.println("---iterate a linked list in reverse order.---");
        Iterator iterator2=linkedList.descendingIterator();
        while (iterator2.hasNext())
        {
            System.out.println(iterator2.next());


        }
        System.out.println("---insert the specified element at the specified position in the linked list.---");
       linkedList.addFirst(0);
       linkedList.addLast(30);
        System.out.println(linkedList);

        System.out.println("---insert elements into the linked list at the first and last positions.---");
        linkedList.addFirst(80);
        System.out.println(linkedList);
    }
}
