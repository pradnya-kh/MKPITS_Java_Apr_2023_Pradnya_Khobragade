package Comparableandcomparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        Student[] students = new Student[5];
        students[0] = new Student("Siya", 99);
        students[1] = new Student("Riya", 89);
        students[2] = new Student("Priya", 55);
        students[3] = new Student("Rita", 88);
        students[4] = new Student("Mrunail", 79);
        arrayList.addAll((Arrays.asList(students)));
        //anonyans class
        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(arrayList);


        //Lambda expression
        Comparator<Student> comr = (o1, o2) -> {
            if(o1.getMarks()== o2.getMarks())
                return 0;
            else if (o1.getMarks()>o2.getMarks()) {
                return -1;
            }else
                return 1;

        };
        Collections.sort(arrayList,comr);
        System.out.println(arrayList);

    }
    }


