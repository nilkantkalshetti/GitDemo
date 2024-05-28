package BasicJavaPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList multiList = new ArrayList();
		multiList.add("Nilkant");
		multiList.add(41);
		multiList.add("aa@email.com");
		System.out.println(multiList.get(2));
		multiList.add(2, "bb@bb.com");
		System.out.println(multiList.get(2));
		multiList.add(39.50);
		multiList.add("Pallavi");
		multiList.remove("Nilkant");
		System.out.println(multiList.get(0));
		System.out.println(multiList.size());
		System.out.println("=====List all values from array=======");
		for(int i=0; i<multiList.size(); i++) {
			System.out.println(multiList.get(i));
		}
		
		ArrayList nameArray = new ArrayList();
		nameArray.add("Nilkant");
		nameArray.add("Pallavi");
		nameArray.add("Akhil");
		nameArray.add("Anvay");
		Collections.sort(nameArray);
		System.out.println("=====sort values from Array=======");
		for(int i=0; i<nameArray.size(); i++) {
			System.out.println(nameArray.get(i));
		}
		Collections.reverse(nameArray);
		System.out.println("=====sort values from Array reversway=======");
		for(int i=0; i<nameArray.size(); i++) {
			System.out.println(nameArray.get(i));
		}
		
		
	}

}
