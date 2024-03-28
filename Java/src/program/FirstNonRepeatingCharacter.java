package program;
/*Write a function that takes in a string of lowercase alphabet letters and returns the index of the string's first non repeating character.
 * The First non repeating character is the first character in the String that occurs only ones.
 * If the first String does not have a non repeating character, the function should return -1.
 * input:abcdcaf
 * output:1
 * */
public class FirstNonRepeatingCharacter {
public static int findfirstNonRepeatingCharacter(String s) {
	 int[] charcount=new int[26];//Assuming only lower English alphabet letters
	 for(char c:s.toCharArray()) {
		 charcount[c-'a']++;
	 }
	 for (int i = 0; i < s.length(); i++) {
		if(charcount[s.charAt(i)-'a']==1) {
			return i;
		}
	}
	return-1;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String input="abcdcaf";
  int output=findfirstNonRepeatingCharacter(input);
  System.out.println("Input: "+input);
  System.out.println("Output: "+output);
	}

}
