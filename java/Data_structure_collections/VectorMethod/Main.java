package VectorMethod;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vector=new  Vector();
        vector.add(300);
        vector.add(400);
        vector.add(300);
        vector.add(600);
        vector.add(700);
        System.out.println(vector);
        System.out.println(vector.capacity());
        System.out.println(vector.clone());
        System.out.println(vector.indexOf(1, 4));
        System.out.println(vector.get(3));
        System.out.println(vector.elementAt(4));
        System.out.println(vector.remove(3));
    }
}
