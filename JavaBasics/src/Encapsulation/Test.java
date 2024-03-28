package Encapsulation;

public class Test {

	public static void main(String[] args) {
		Customer c=new Customer();
		c.setFirstName("Ajith");
		c.setLastname("Kumar ");
		c.setCreditCard("567890");
		System.out.println("FirstName:"+c.getFirstName());
		System.out.println("Last Name: "+c.getLastName());
		System.out.println("Credit Card: "+c.getCreditCard());
	}

}
