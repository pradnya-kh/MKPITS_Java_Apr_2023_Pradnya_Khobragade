
package interfacepackage;

public class Rectangle implements interfacepackage.Shape {
    private int length;
    private int breath;

    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    @Override
    public void area() {

        double area= length*breath;
        System.out.println("area of Rectagle is"+area);
    }
}
