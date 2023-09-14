package Comparableandcomparator;

public class Student {
    private String name;
    private int Marks;

    public Student(String name, int marks) {
        this.name = name;
        Marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;



    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\t' +
                ", Marks=" + Marks +
                '}';
    }
}
