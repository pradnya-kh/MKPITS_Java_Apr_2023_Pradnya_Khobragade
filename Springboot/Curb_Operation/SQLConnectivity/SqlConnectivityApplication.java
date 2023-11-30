package com.example.SQLConnectivity;

import com.example.SQLConnectivity.dao.StudentDAO;
import com.example.SQLConnectivity.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class SqlConnectivityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqlConnectivityApplication.class, args);
		System.out.println("hii");
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner->{
//			createStudent(studentDAO);
//			readStudent(studentDAO);
//			deletrecord(studentDAO);
//			updateRecord(studentDAO);
			showTableRecord(studentDAO);


		};
	}
   public void createStudent(StudentDAO studentDAO){
	   Student student=new Student("Rita","wadi","Nagpur");

	   studentDAO.save(student);
   }
   public  void readStudent(StudentDAO studentDAO) {
	   Student student = studentDAO.findrollno(6);
	   System.out.println(student);
   }
   public void deletrecord(StudentDAO studentDAO){
	   studentDAO.deleteRecord(2);

	   }

   public void updateRecord(StudentDAO studentDAO){
		Student student=new Student();
		student.setRollno(2);
		student.setName("Radha");
		student.setAddress("RamNager");
		student.setCity("pune");
		studentDAO.updateRecord(student);
		System.out.println("Data Update Succefully");
   }
   public void  showTableRecord(StudentDAO studentDAO) {
	   List<Student> studentList=studentDAO.findAll();
	   System.out.println("Display All record....!!!");
	   Iterator iterator= studentList.listIterator();
	   while(iterator.hasNext()){
		   System.out.println(iterator.next());
	   }
   }
   }

