package com.AnnoationJavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            MyBean myBean = context.getBean(MyBean.class);

            System.out.println("DependencyA Value: " + myBean.getDependencyA().getValue());
            System.out.println("DependencyB Number: " + myBean.getDependencyB().getNumber());
            System.out.println("Another DependencyA Value: " + myBean.getAnotherDependencyA().getValue());
        }
	}

}
