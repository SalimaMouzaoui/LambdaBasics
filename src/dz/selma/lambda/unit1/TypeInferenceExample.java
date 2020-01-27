package dz.selma.lambda.unit1;

public class TypeInferenceExample {
	
	public static void main(String[] args) {
//		When you have just one parameter youn don't need the ()
		StringLengthLambda lambda = s -> s.length();
		System.out.println(lambda.getLength("Hello Lambda"));
		
//		Via a static method
		printLambda(s -> s.length());
	}

	public static void printLambda(StringLengthLambda lambda){
		System.out.println(lambda.getLength("Hello Lambda"));
	}
	
	interface StringLengthLambda {
		int getLength(String str);
	}
}
