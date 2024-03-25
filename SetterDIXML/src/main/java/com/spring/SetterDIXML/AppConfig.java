package com.spring.SetterDIXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * create spring core application using  XML based configuration,intialize a bean with two dependent beans using setter dependency injection.
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
        return new BeanB("24");
    }
	@Bean
    public BeanC beanC(BeanA beanA, BeanB beanB) {
        return new BeanC(beanA, beanB);
    }
}
    

