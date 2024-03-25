package com.spring.ConstructorDIXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * create spring core application using  XML based configuration,intialize a bean with two dependent beans using constructor dependency injection.
 *
 */

@Configuration
public class AppConfig
{

	@Bean
		public BeanA beanA() {
		return new BeanA("Ajith");
	}
	@Bean
    public BeanB beanB() {
        return new BeanB("23");
    }
	@Bean
    public BeanC beanC(BeanA beanA, BeanB beanB) {
        return new BeanC(beanA, beanB);
    }
}
    

