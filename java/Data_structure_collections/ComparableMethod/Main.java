package ComparableMethod;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList <Student>linkedList=new LinkedList<Student>();
        Student[]students=new Student[5];
        students[0]=new Student("Siya",99);
        students[1]=new Student("Riya",89);
        students[2]=new Student("priya",89);
        students[3]=new Student("rita",88);
        students[4]=new Student("mrunail",89);
        linkedList.addAll((Arrays.asList(students)));
        for(Student student:linkedList){
            System.out.println(student.getName()+""+student.getMarks());
        }


    }
}
