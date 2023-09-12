package LambdaExprsessionExample;

public class Main {
    public static void main(String[] args) {
        Shape s=(l,b)-> System.out.println("Area of Rectangle="+(l*b));
        s.calArea(5,5);
    }
}
