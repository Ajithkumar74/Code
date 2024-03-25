package String;

public class CountCharacter {

	public static void main(String[] args) {
		String string="The Best of both words";
		
		int count=0;
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("Total number of character in a string: "+count);
	}

}
