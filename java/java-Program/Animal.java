public interface Animal {
    void makeSound();  // Abstract method declaration

    default void sleep() {  // Default method implementation
        System.out.println("Zzzz...");
    }
}

// Implement the Animal interface in a class
public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Implement the Animal interface in another class
public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Main class to demonstrate interface usage
public class InterfaceExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();  // Output: "Woof!"
        dog.sleep();      // Output: "Zzzz..."

        Animal cat = new Cat();
        cat.makeSound();  // Output: "Meow!"
        cat.sleep();      // Output: "Zzzz..."
    }
}
