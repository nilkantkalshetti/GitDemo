package BasicJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrayList = { "100", "200", "300", "400", "500" };
		String serachNo = "300";
		int arraySize = arrayList.length;
		
		//convert array to arraylist and print arraylist. serach specific number using contains keyword
		List conArray = Arrays.asList(arrayList);
		// System.out.println(conArray.contains(200));
		System.out.println(conArray);
		System.out.println(conArray.contains("200"));
		
		//search specific number and its location
		int firstNo = 0;
		int lastNo = arraySize - 1;
		for (int i = 0; i < arraySize; i++) {
			if(arrayList[i]==serachNo) {
				int k = i+1;
				System.out.println(serachNo+" exist in array list");
				System.out.println(serachNo+" found at location "+ k);
				break;
			}
		}
		System.out.println("First Number = "+arrayList[firstNo]);
		System.out.println("Last Number = "+arrayList[lastNo]);
		
		//Search first, last and middle number
		
		System.out.println("***********************");
		System.out.println("***********************");
		
		int numberArray[] = {1, 2, 3, 4, 5};
		int searchNo = 4;
		int numberArraySize = numberArray.length;
		int first = 0;
		int last = numberArraySize - 1;
		int middle = (first+last)/2;
		while(first <= last) {
			if(numberArray[middle] < searchNo)
				first = middle + 1;
			else {
				if(numberArray[middle]==searchNo) {
					System.out.println(searchNo+" found number at location " + (middle+1) + ".");
					break;
				}else
					last = middle - 1;
				middle = (first+last)/2;
			}
		}
		if (first > last)
			System.out.println(searchNo + " isn't present in the list.\n");
	}

}
