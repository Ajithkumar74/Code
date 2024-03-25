package com.spring.ConstructorDIXML;

public class BeanC {
		private final BeanA beanA;
		private final BeanB beanB;
		
		public BeanC(BeanA beanA, BeanB beanB) {
			this.beanA = beanA;
			this.beanB = beanB;
		}
		public void performOperationC() {
	        System.out.println("Bean C performing operation C");
	        System.out.println("Employee name A from BeanA: " + beanA.getName());
	        System.out.println("Employee age B from BeanB: " + beanB.getAge());
	    }
}

