package com.spring;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;  

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory; 
public class test {

	public static void main(String[] args) {
	    Resource resource=new ClassPathResource("application.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);
	    Student student=(Student)factory.getBean("student");  
	    student.displayInfo();  
	}

}
