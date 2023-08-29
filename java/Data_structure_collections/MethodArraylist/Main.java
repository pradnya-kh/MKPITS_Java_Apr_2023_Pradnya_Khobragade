package MethodArraylist;

import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List list =new ArrayList();
        list.add(45);
        System.out.println(list);
       list.add(1,35);
        System.out.println(list);

        list.add("Pradnya");
        System.out.println(list);
        System.out.println("using for loop");
        for(int elementNumber=0;elementNumber<list.size();elementNumber++){
            System.out.println(list.get(elementNumber));
        }
        List list1=new ArrayList();
        list1.add(55);
        list1.add(65);

    }
}
