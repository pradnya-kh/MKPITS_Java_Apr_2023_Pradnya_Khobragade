package menudrivenprogramoflinklist;

import java.util.Scanner;

public class Main {
        public static void main(String[] args){

            Student student=null;
            Scanner scanner=new Scanner(System.in);
            int choice;
            StudentServiceClass studentServiceClass=new StudentServiceClass();
            while (true){
                System.out.println("1. Add Record"+"\n"+"2. Display Record"+"\n"+"3. Find Record"+"\n"+
                        "4. Modify Record"+"\n"+"5. Delete record"+"\n"+"6. Delete All record"+"\n"+"7. Exit");
                System.out.print("Enter one of the choice : ");

                choice= scanner.nextInt();
                switch (choice){
                    case 1:
                        student = new Student();
                        System.out.println("Enter name and marks of student : ");
                        student.setName(scanner.next());
                        student.setMarks(scanner.nextInt());
                        studentServiceClass.addStudentRecord(student);
                        break;
                    case 2:
                        if(student!=null){
                            System.out.println("Display records of the Student : ");
                            studentServiceClass.displayStudentRecord();
                            break;
                        }else{
                            System.out.println("No records available");
                        }
                    case 3:
                        System.out.print("Search the record number : ");
                        studentServiceClass.findSudentRecord();
                        break;
                    case 4:
                        student=new Student();
                        System.out.println("Enter the record number which you want to modify :");
                        studentServiceClass.modifyStudentRecord(student);
                        break;
                    case 5:
                        System.out.println("Enter the record number which tou want to delete : ");
                        studentServiceClass.deleteSingleRecord();
                        break;
                    case 6:
                        System.out.println("Delete all the record :");
                        studentServiceClass.deleteAllRecords();
                        break;
                    case 7:
                    return;
                }
            }

        }
    }

