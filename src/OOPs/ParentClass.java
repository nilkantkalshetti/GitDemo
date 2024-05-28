package OOPs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ParentClass {
	
	public void firstMethod() {
		System.out.println("Running parent firstMethod");
	}
	
	@BeforeMethod
	public void beforeRun() {
		System.out.println("Running parent beforeRun");
	}
	
	@AfterMethod
	public void afterRun() {
		System.out.println("Running parent afterRun");
	}
	
}
