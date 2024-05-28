package BasicJavaPrograms;

import java.util.Arrays;

public class ArrayExercise {

	public static void main(String[] args) {
		//=============Search/Sort using Arrays method (Binary. Sort)======
		// search and sort number
		int array[] = { 10, 20, 30, 50, 80, 40 };
		System.out.println("Element found at location: " + Arrays.binarySearch(array, 80)); // it returns position of
		Arrays.sort(array);
		System.out.print("Printing sorted number array=> ");
		for(int s :array) {
			System.out.print(s+" ");
		}
		System.out.println("");
		
		// search and sort String
		String array1[] = { "Nilkant", "Pallavi", "Akhil", "Anvay", "Nil" };
		System.out.println("Element found at location: " + Arrays.binarySearch(array1, "Akhil"));
		if (Arrays.binarySearch(array1, "Akhil") >= 0) {
			System.out.println("Search string present in array list");
		} else {
			System.out.println("Search string NOT present in array list");
		}
		Arrays.sort(array1);
		System.out.print("Printing sorted string array=> ");
		for(String s1 :array1) {
			System.out.print(s1+" ");
		}
		System.out.println("");
		
		//============= SearchNumberinArray ============
		int arrayInt[] = { 10, 20, 30, 50, 80, 40 };
		int serachNo = 100;
		searchNumberinArray(arrayInt, serachNo);

		
		//============= SearchStringinArray ============
		String arrayString[] = { "Nilkant", "Pallavi", "Akhil", "Anvay", "Nil" };
		String serachString = "Nil1";
		String strCnt = searchStringinArray(arrayString, serachString);
		if (strCnt == "true") {
			System.out.println(serachString + " Element found!");
		} else {
			System.out.println(serachString + " Element NOT found!");
		}
		
		//=============sum of arrays===================
		int arraySum[] = { 10, 20, 30, 50, 80, 40 };
		int sum = 0;
		for(int sumval :arraySum) {
			sum = sum + sumval;
		}
		System.out.println("Sum of arrays => "+sum);
		
	}

	public static void searchNumberinArray(int[] array, int serachNumber) {
		int cnt = 0;
		for (int a : array) {
			if (a == serachNumber) {
				System.out.println(serachNumber+" Element found!");
				cnt = 1;
				break;
			}
		}
		if (cnt == 0) {
			System.out.println(serachNumber+" Element NOT found!");
		}

	}

	public static String searchStringinArray(String[] arrayStirng, String serachString) {
		String strReturnCnt = "false";
		for (String s : arrayStirng) {
			if (s == serachString) {
				strReturnCnt = "true";
			}
		}
		return strReturnCnt;
	}
}
