public class Main {
    public static void main(String[] args) {
        CalculateServise calculateServise=new CalculateServise();
        calculateServise.calculate("+",10.0,10.1);
        calculateServise.calculate("-",10.0,5.1);
        calculateServise.calculate("*",10.1,10.2);
        calculateServise.calculate("/",15.1,3.0);
    }
}