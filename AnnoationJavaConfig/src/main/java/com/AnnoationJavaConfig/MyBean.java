package com.AnnoationJavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class MyBean {
	
	private DependencyA dependencyA;
	private DependencyB dependencyB;
	private String name;
	
	//Constructor Injection using @Autowired
	@Autowired
	public MyBean(DependencyA dependencyA) {
		this.dependencyA = dependencyA;
	}

	
	//Setter Injection using @Required and @Autowired
	@Required
	@Autowired
    public void setDependencyB(@Qualifier("dependencyB") DependencyB dependencyB) {
        this.dependencyB = dependencyB;
    }
	// Member Variable Initialization using @Autowired
    @Autowired
    @Qualifier("dependencyA")
    private DependencyA anotherDependencyA;

    // Getter and Setter methods

	public DependencyA getDependencyA() {
		return dependencyA;
	}


	public void setDependencyA(DependencyA dependencyA) {
		this.dependencyA = dependencyA;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public DependencyA getAnotherDependencyA() {
		return anotherDependencyA;
	}


	public void setAnotherDependencyA(DependencyA anotherDependencyA) {
		this.anotherDependencyA = anotherDependencyA;
	}


	public DependencyB getDependencyB() {
		return dependencyB;
	}


   
}
