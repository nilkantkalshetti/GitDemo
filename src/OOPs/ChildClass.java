package OOPs;

import org.testng.annotations.Test;

public class ChildClass extends ParentClass {

	@Test
	public void childMethod1() {
		firstMethod();
		
		Common cm = new Common(2);//parameterized constructor
		System.out.println(cm.increment());
		System.out.println(cm.decrement());
		System.out.println(cm.multiplyTwo());
		System.out.println(cm.multiplyThree());
	}
	
	/*
	 * @Test public void childMethod2() {
	 * System.out.println("Running child childMethod2"); }
	 */
	
	
	
	
	
	
}
