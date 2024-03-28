package com.spring.ConstructorDIXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {
	public static void main( String[] args )
    {
        // Create the application context using the configuration class

    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	//Retrieve the beans from the context
    	BeanA beanA=context.getBean(BeanA.class);
    	BeanB beanB=context.getBean(BeanB.class);
    	BeanC beanC=context.getBean(BeanC.class);
        // You can now use the beans as needed
    	 beanA.performOperationA();
         beanB.performOperationB();
         beanC.performOperationC();
    }

}
