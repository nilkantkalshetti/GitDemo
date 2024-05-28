package BasicJavaPrograms;

public class GreatestOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// GreatestOfThreeNumbers
		int a = 20; int b = 50; int c = 40;
		if (a > b && a > c) {
			System.out.println("Greatest Of Three Numbers is : " + a);
		} else if (b > a && b > c) {
			System.out.println("Greatest Of Three Numbers is : " + b);
		} else {
			System.out.println("Greatest Of Three Numbers is : " + c);
		}
		
		//MaxAndMinElementInArray
		int arrayNo[] = {100, 600, 300, 800, 700};
		//max value in array
		int max = arrayNo[0];
		for(int i=0; i<arrayNo.length; i++) {
			if(arrayNo[i] > max) {
				max = arrayNo[i];
			}
		}
		System.out.println("Max value in array = "+max);
		//min value in array
		int min = arrayNo[0];
		for(int i = 0; i < arrayNo.length; i++) {
			if(arrayNo[i] < min) {
				min = arrayNo[i];
			}
		}
		System.out.println("Max value in array = "+min);			
		
		
	}

}
