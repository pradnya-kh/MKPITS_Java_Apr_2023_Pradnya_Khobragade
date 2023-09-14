package ConstructionMethodReff;

public class Main {
    public static void main(String[] args) {
        YourInterface yourInterface=Student::new;
        Student student=yourInterface.display();
    }
}
