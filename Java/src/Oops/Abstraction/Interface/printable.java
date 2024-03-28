package Oops.Abstraction.Interface;

interface print{
	void print();
}
class printable implements print {
	
	public void print() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		printable obj=new printable();
		obj.print();
	}

}
