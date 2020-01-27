package dz.selma.lambda.unit3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		//Thread t = new Thread(() -> printMessage());
		// method reference :: used when you dn't have argument and method called without argument 
		// we add the name of class::method
		// () -> method() => ClassName::method
		Thread t = new Thread(MethodReferenceExample1::printMessage);
		t.start();
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}
}
