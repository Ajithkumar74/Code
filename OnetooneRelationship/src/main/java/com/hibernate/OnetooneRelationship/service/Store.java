package com.hibernate.OnetooneRelationship.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.OnetooneRelationship.beans.Address;
import com.hibernate.OnetooneRelationship.beans.EmployeeDetails;

public class Store {

	public static void main(String[] args) {
		EmployeeDetails e1=new EmployeeDetails();
		e1.setName("Karthik");
		e1.setEmail("Karthik@gmail.com");
		
		Address address1=new Address();
		address1.setAddressLine1("F-9, ABC Nagar");
		  address1.setCity("Ghaziabad");    
		    address1.setState("UP");    
		    address1.setCountry("India");    
		    address1.setPincode(201301);
		  //Bidirectional Relationship   
		    e1.setAddress(address1);    
		    address1.setEmployee(e1); 
		    
		    SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
		    Session session=sessionfactory.openSession();
		    session.beginTransaction();
		    session.save(e1);//empid, empname, email, addressobject-> addressid, s
		    session.getTransaction().commit();
	}

}
