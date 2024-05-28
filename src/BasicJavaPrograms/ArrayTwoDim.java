package BasicJavaPrograms;

public class ArrayTwoDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][2];
		a[0][0] = 100;
		a[0][1] = 200;
		a[1][0] = 300;
		a[1][1] = 400;
		a[2][0] = 500;
		a[2][1] = 600;
		System.out.println(a.length);
		System.out.println(a[0].length);
		for (int r[] : a) {
			for (int c : r) {
				System.out.println(c);
			}
		}

		int b[][] = { { 2, 3 }, { 4, 5 }, { 6, 7 }, { 8, 9 } };
		for(int k[] :b) {
			System.out.println("aa");
			for(int m :k) {
				System.out.println(m);
			}
		}
	}

}
