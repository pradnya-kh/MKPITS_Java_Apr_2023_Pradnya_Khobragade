package Cursors_program;


import java.util.Enumeration;
        import java.util.Iterator;
        import java.util.ListIterator;
        import java.util.Vector;

public class CursorsDemo {
    public void implementedClassesOnCursor(){
        Vector vector = new Vector();
        Enumeration enumeration = vector.elements();
        Iterator iterator = vector.iterator();
        ListIterator listIterator = vector.listIterator();
        System.out.println(enumeration.getClass().getName());
        System.out.println(iterator.getClass().getName());
        System.out.println(listIterator.getClass().getName());
    }
}