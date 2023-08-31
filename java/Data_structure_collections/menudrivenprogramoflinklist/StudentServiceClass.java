package menudrivenprogramoflinklist;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentServiceClass {
    Scanner scanner=new Scanner(System.in);
    LinkedList<Student> studentLinkedList;
    StudentServiceClass() {
        this.studentLinkedList=new LinkedList<Student>();
    }

    public void addStudentRecord(Student student){
        studentLinkedList.add(student);
    }

    public void displayStudentRecord(){

        for (Student student1:studentLinkedList){
            System.out.println(student1);
        }
    }
    public  void findSudentRecord(){
        int index=scanner.nextInt();
        System.out.println(studentLinkedList.get(index));
    }
    public void modifyStudentRecord(Student student){
        int indexModify=scanner.nextInt();
        System.out.println(studentLinkedList.get(indexModify));
        System.out.println("Enter the new name and marks : ");
        student.setName(scanner.next());
        student.setMarks(scanner.nextInt());
        studentLinkedList.set(indexModify, student);
    }
    public void deleteSingleRecord(){
        int indexDelete=scanner.nextInt();
        studentLinkedList.remove(indexDelete);
        displayStudentRecord();
    }
    public void deleteAllRecords(){
        studentLinkedList.clear();
        displayStudentRecord();
    }
}
