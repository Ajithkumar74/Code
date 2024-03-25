package com.AnnoationJavaConfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration
public class AppConfig
{
	@Bean
	public DependencyA dependencyA() {
		DependencyA dependencyA=new DependencyA();
		dependencyA.setValue("Value from DependencyA");
        return dependencyA;
	}
	  @Bean
	    @Qualifier("dependencyB")
	    public DependencyB dependencyB() {
	        DependencyB dependencyB = new DependencyB();
	        dependencyB.setNumber(42);
	        return dependencyB;
	    }

	    @Bean
	    public MyBean myBean() {
	        return new MyBean(dependencyA());
	    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
