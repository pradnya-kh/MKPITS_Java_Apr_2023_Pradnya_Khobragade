/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_project;

import setterMethod.Employe;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author user
 */
public class depandentsetterMain {
    public static void main(String[] args){
        Resource resource = new ClassPathResource("depandentsSetterInjection.xml");
       BeanFactory factory = new XmlBeanFactory(resource);
       
        Employe employe=(Employe)factory.getBean("Setterbean2");
       employe.displayEmploye();
       
        
    }
    
}
