package BasicJavaPrograms;

public class Palindrome {

	public static void main(String[] args) {
		//Palindrome for Int
		int lastDigit, sum = 0, a;
		int inputNumber = 171; // It is the number to be checked for palindrome
		a = inputNumber;
		// Code to reverse a number
		while(a>0) {
			lastDigit = a%10;
			sum = lastDigit + (sum * 10);
			a = a/10;
		}
		if(sum == inputNumber) {
			System.out.println("Palindrome String");
		}else {
			System.out.println("Not a palindrome String");
		}

		//Palindrome for String
		String text = "MAN";
		int textLen = text.length();
		String palindromeText = "";
		for(int i = textLen - 1; i >= 0; i--) {
			palindromeText = palindromeText + text.charAt(i);
		}
		if(text.equals(palindromeText)) {
			System.out.println("Palindrome String");
		}else {
			System.out.println("Not a palindrome String");
		}
	}

}
