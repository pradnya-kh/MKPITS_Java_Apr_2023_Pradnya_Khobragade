/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_project;

import Empolye.Address;
import Empolye.Employe;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import stud.Student;


/**
 *
 * @author user
 */
public class Spring_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Resource resource=new ClassPathResource("applicationContext.xml");
//        BeanFactory factory=new XmlBeanFactory(resource);
//        Student student=(Student)factory.getBean("studbean");
       Resource resource = new ClassPathResource("applicationContext.xml");
       BeanFactory factory = new XmlBeanFactory(resource);
       Student student = (Student) factory.getBean("studbean");
       student.display();
       
       Employe employe=(Employe)factory.getBean("employebean");
       employe.displayEmploye();
       
        
    }
    
}
