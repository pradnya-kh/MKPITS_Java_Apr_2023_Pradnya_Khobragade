package com.example.SQLConnectivity;

import com.example.SQLConnectivity.dao.StudentDAO;
import com.example.SQLConnectivity.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SqlConnectivityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqlConnectivityApplication.class, args);
		System.out.println("hii");
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner->{
			createStudent(studentDAO);
		};
	}
   public void createStudent(StudentDAO studentDAO){
	   Student student=new Student("Pradnya","vadi","Nagpur");

	   studentDAO.save(student);
   }
}
