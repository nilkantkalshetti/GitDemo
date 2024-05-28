package BasicJavaPrograms;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		if (num % 2 == 0) {
			System.out.println(num + " this is even number");
		} else {
			System.out.println(num + " this is odd number");
		}
		System.out.println("==========");
		int num1[] = { 2, 4, 5, 7, 8, 9 };
		for (int indnum : num1) {
			if (indnum % 2 == 0) {
				System.out.println(indnum + " this is even number");
			} else {
				System.out.println(indnum + " this is odd number");
			}
		}
		System.out.println("==========");
		int num2[] = {1,2,3,4,5,6,7,8,9,10};
		int arraySize = num2.length;
		System.out.print("Even Numbers = ");
		for(int i=0; i<arraySize; i++) {
			if(num2[i]%2==0) {
				System.out.print(num2[i]+" ");
			}
		}
		System.out.println("");
		System.out.print("Odd numbers = ");
		for(int j=0; j<arraySize; j++) {
			if(num2[j]%2!=0) {
				System.out.print(num2[j]+" ");
			}
		}
	}

}
