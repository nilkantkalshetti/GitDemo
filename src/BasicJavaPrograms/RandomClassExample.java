package BasicJavaPrograms;

import java.util.Random;

public class RandomClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print random numbers from 0 to 50");
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println("=Integer=" + random.nextInt(50) + "=Double=" + random.nextDouble(5) + "=Float="
					+ random.nextFloat(10));
		}
		System.out.println("Print random numbers from 0 to 50");
		for (int i = 0; i < 5; i++) {
			System.out.println(Math.random() * 2);
		}
	}

}
