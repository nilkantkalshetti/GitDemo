package BasicJavaPrograms;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Nilkant");
		list.add("Pallavi");
		list.add("Akhil");
		list.add("Anvay");
		
		System.out.println(list.size());
		
		for(String name :list) {
			System.out.println(name);
		}
		
		addTwoMatrix();
		sumTwoNo(3,6);
		System.out.println(multiTwoNo(5,6));
		
		ArrayListExample1 d2 = new ArrayListExample1();
		System.out.println("Dividing 2 numbers = "+ d2.divideTwoNo(12, 3));
	}

	public static void addTwoMatrix() {
		//int first[][] = {{1,2},{3,4}};
		//int second[][] = {{5,6},{7,8}};
		System.out.println("Print methid execution");
	}
	
	public static void sumTwoNo(int i, int j) {
		int k;
		k = i+j;
		System.out.println(k);
	}
	
	public static int multiTwoNo(int x, int y) {
		int z;
		z = x*y;
		return z;
		
	}
	
	public int divideTwoNo(int p, int q) {
		int r;
		r = p/q;
		return r;
	}
}
