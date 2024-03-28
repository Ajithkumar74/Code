package com.spring.ConstructorDIXML;

public class BeanA {
 private String name;

public BeanA(String name) {
	this.name = name;
}
public void performOperationA() {
    System.out.println("Bean A performing operation A");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
