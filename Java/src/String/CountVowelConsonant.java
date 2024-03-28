package String;

public class CountVowelConsonant {

	public static void main(String[] args) {
		int vowelcount=0;
		int ConsonantCount=0;
		String s="Hello World";
		s=s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) =='a' || s.charAt(i) =='e' || s.charAt(i) =='i' || s.charAt(i) =='o' || s.charAt(i) =='u' ) {
				vowelcount++;
			}else {
				ConsonantCount++;
			}
		}
		System.out.println("Number of vowels: "+vowelcount);
		System.out.println("Numbmer of Consonants: "+ConsonantCount);
	}

}
