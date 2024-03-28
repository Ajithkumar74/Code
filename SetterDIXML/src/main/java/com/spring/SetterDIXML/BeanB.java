package com.spring.SetterDIXML;

public class BeanB {
		 private String age;

		public BeanB(String age) {
			super();
			this.age = age;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public void performOperationB() {
	        System.out.println("Bean B performing operation B");
	    }
		
}
