package BasicJavaPrograms;

public class CountWordAndChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Count words in given sentence
		String sentence1 = "I am     Nilkant";
		System.out.println("Length of a given senetnce: " + sentence1.length());
		String[] splitSent1 = sentence1.split(" ");
		int wordCnt = 0;
		for (int i = 0; i < splitSent1.length; i++) {
			if (splitSent1[i] != "") {
				wordCnt++;
			}
		}
		System.out.println("No of word in given senetnce: " + wordCnt);

		// Count characters in word
		String word = "Nilkantappa    ";
		String trimWord = word.trim();
		System.out.println("No of characters in given word: " + trimWord.length());

		// Count characters from given sentence
		String sentence2 = "I wanted to play 2 matches, but played only one";
		String sentenceNew = sentence2.replace(" ", "").trim();
		System.out.println(sentenceNew);
		System.out.println("No of characters in given sentence: " + sentenceNew.length());

		// count character occurence in given word
		//word = nilkantappa
		char sreachChar = 'a';
		String repAwithBlank = trimWord.replace("a", "");
		System.out.println("Current word lenght = " + trimWord.length() + "and After replacing with serach keyword = "
				+ repAwithBlank.length());
		System.out.println("Number of occurances of 'a' is: "+(trimWord.length() - repAwithBlank.length()));

	}

}
