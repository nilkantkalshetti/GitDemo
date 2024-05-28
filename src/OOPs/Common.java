package OOPs;

public class Common extends Common1 {

	int a;

	// default constructor
	public Common(int a) {
		super(a);
		this.a = a;
	}

	public int increment() {
		a = a + 1;
		return a;
	}

	public int decrement() {
		a = a - 1;
		return a;
	}

}