/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_project;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import setterMethod.Question;

/**
 *
 * @author user
 */
public class listSetterMain {
    
  public static void main(String[] args){
  
    Resource r=new ClassPathResource("listSetterapplicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
    Question q=(Question)factory.getBean("ques");  
    q.displayinfolist();
      
  }
}
