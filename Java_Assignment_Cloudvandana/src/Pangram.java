
public class Pangram{
	
	//method for checking that string is pangram or not
	public static boolean pangram(String str) {
		
		int len = str.length();
		//convert all character into lower case
		str = str.toLowerCase();
		//for marking the element that it is present on the string or not
		boolean[] present = new boolean[26];
		
		//code for checking that string is pangram or not
		for(int i=0; i< len; i++) {
			if(Character.isLetter(str.charAt(i)))
			{
				int letter = str.charAt(i)-'a';
				present[letter] = true;
			}
				
			
		}
		
		for(int i=0; i<26;i++) {
			if(present[i]==false){
				return false;
				
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		if(pangram(str)) {
			System.out.println("Given String is pangram");
		}
		else {
			System.out.println("Given String is not pangram");
		}
	}
}