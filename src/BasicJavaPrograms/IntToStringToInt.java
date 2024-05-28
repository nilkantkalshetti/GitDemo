package BasicJavaPrograms;

public class IntToStringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 123;
		String a = Integer.toString(i);
		System.out.println(a);

		// number of digits
		int j = 12345;
		int cnt = 0;
		while (j != 0) {
			j = j/10;
			cnt++;
		}
		System.out.println(cnt);
	}

}
