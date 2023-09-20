package Assignment;

import java.util.ArrayList;
import java.util.Comparator;

public class OldestAndYoungestByStream {
    public static void oldestYoungest() {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(new Student("Shubham",22));
        arrayList.add(new Student("Shivam",18));
        arrayList.add(new Student("Aniket",20));
        arrayList.add(new Student("Pranay",21));
        arrayList.add(new Student("Bhagyashri",30));

        Student student1 = arrayList.stream().min(Comparator.comparingInt(Student::getAge)).get();
        System.out.println("Lowest age = "+ student1.getAge() + ", " + "Name = " + student1.getName());
        Student student2 = arrayList.stream().max(Comparator.comparingInt(Student::getAge)).get();
        System.out.println("Highest age = "+ student2.getAge() + ", "+ "Name = " + student2.getName());


    }
}
