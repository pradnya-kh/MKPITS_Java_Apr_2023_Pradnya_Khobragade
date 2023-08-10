
package interfacepackage;
public class Circle implements interfacepackage.Shape {
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    @Override

    public void area(){
        System.out.println ("area of circle :" +(3.14 * radius*radius));


    }

}
