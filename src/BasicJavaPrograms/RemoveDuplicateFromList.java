package BasicJavaPrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList wordList = new ArrayList();
		wordList.add("Nil");
		wordList.add("Pallavi");
		wordList.add("Akhil");
		wordList.add("Nil");
		wordList.add("Anvay");
		wordList.add("Anvay");
		System.out.println("Printing list as is => "+wordList);
		
		//A HashSet is a collection of items where every item is unique, and it is found in the java.util package
		//If you create HashSet on existing Array, it will remove duplicate values from existing array automatically
		
		HashSet set = new HashSet(wordList);
		System.out.println("Printing list as is => "+set);

	}

}
