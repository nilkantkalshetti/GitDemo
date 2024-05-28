package BasicJavaPrograms;

public class WorkWithString {

	public static void main(String[] args) {
		//===================Remove junk value from String
		String junkText = "I a##%$m super^&*man";
		String rmJunkText = junkText.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(rmJunkText);
		
		//Remove white spaces
		String text = "I am   super         man";
		String rmText = text.replaceAll("\\s", "");
		System.out.println(rmText);
		
		//===================Reverse String
		String word = "Nilkantappa";
		String reverseWord = "";
		int wordLen = word.length();
		for(int i = wordLen - 1; i >=0; i-- ) {
			reverseWord = reverseWord + word.charAt(i);
		}
		System.out.println("Reverse word => "+reverseWord);
		
		//==================Reverse words
		String wordString = "I am super man";
		String wordStringReverse = "";
		String[] wordStringArray =  wordString.split(" ");
		int wordStringArrayLen = wordStringArray.length;
		for(int i = wordStringArrayLen-1; i >= 0; i--) {
			wordStringReverse = wordStringReverse + " " +wordStringArray[i];
		}
		System.out.println("Reverse words => "+wordStringReverse.trim());
		
		//Operation on String
		String a1 = "Welcome";
		String a2 =" to Java";
		System.out.println("Concating 2 string => "+a1.concat(a2));
		System.out.println("Check specific word in given string => " + a2.contains("Java")); // Return True
		System.out.println("Check specific word not in given string => " + a2.contains("java")); // Return False
		System.out.println("Compare with case sensitive => "+ a1.equals("WELCOME"));
		System.out.println("Compare with case sensitive => "+ a1.equalsIgnoreCase("WELCOME"));
		System.out.println("Replace single character => "+ a2.replace("o", "a"));
		System.out.println("Replace single word => "+ a2.replace("to", "from"));
		System.out.println("Substring => "+ a1.substring(2, 4));//starting point + length of word or string
		System.out.println("Print character based on given position => "+a1.charAt(3));
		System.out.println("Print lower case => "+a1.toLowerCase());
		System.out.println("Print upper case => "+a1.toUpperCase());
		System.out.println("Print length of string => "+a1.length());
		
		//============Swap 2 words WITH temp variable====================
		String s1 = "Hello";
		String s2 = "World";
		String s3 = "";
		System.out.println("Print before swapping => s1 = "+s1+" and s2 = "+s2);
		s3 = s2;
		s2 = s1;
		s1 = s3;
		System.out.println("Print after swapping => s1 = "+s1+" and s2 = "+s2);
		
		//============Swap 2 words WITHOUT temp variable====================
		String s4 = "Hello";
		String s5 = "World";
		s4 = s4 + s5;//WorldHello
		s5 = s4.substring(0, s5.length());//Hello
		s4 = s4.substring(s5.length());//World
		System.out.println(s4 + " "+ s5);
		
		int s6 = 5;
		int s7 = 10;
		s6 = s6 + s7;//15
		s7 = s6 - s7;//5
		s6 = s6 - s7;
		System.out.println(s6 + " "+ s7);
		
		
		
		
		
	}

}
