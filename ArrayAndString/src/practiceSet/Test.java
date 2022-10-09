package practiceSet;

public class Test extends Derived {
	public void getDetails() {
		System.out.printf("test class");
		super.getDetails();
	}
	public static void main(String[] args) {
		Derived obj = new Test();
		obj.getDetails();
	}

}
