package ConstructionMethodReff;

public class Student {
    private String name;
    private int Marks;

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

    public Student(){

        }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Marks=" + Marks +
                '}';
    }
}

