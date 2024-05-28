package BasicJavaPrograms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 500, 300, 200, 400, 100 };
		int n = array.length;
		System.out.println("Print array values before bubble sort");
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for(int j=1; j < (n-i); j++) {
				int k = j-1;
				if(array[k] > array[j]) {
					temp = array[k];
					array[k] = array[j];
					array[j]=temp;
				}

			}
		}
		
		System.out.println("Print array values after bubble sort");
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}

	}
	

}
