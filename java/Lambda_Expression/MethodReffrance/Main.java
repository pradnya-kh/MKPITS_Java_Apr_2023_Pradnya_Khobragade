package Methodref;
//for static method
public class Main {
    public static void main(String[] args) {
        MyInterface myInterface=MyClass::display;
        myInterface.disp();
        Runnable runnable=MyClass::display;
        Thread thread=new Thread(runnable);
        thread.start();
    }
}

