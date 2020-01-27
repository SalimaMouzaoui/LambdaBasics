package dz.selma.lambda.unit1;

public class Greeter {

	public void greet(Greeting greeting){
		greeting.perform();
	}


	public static void main(String[] args) {

		//		POO 
		Greeter greeter = new Greeter();
		
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		//		greeter.greet();

		//		Lambda Expression
		Greeting myLambdaGreeting = () -> System.out.println("Hello World Lambda");
		myLambdaGreeting.perform();

//		Inner Class Anonymous
		Greeting innerClassAnonymousGreeting = new Greeting() {

			@Override
			public void perform() {
				// TODO Auto-generated method stub
				System.out.println("Hello World Inner Class Anonymous");
			}
		};

		innerClassAnonymousGreeting.perform();

		System.out.println("Lambda");
		greeter.greet(myLambdaGreeting);
		System.out.println("Inner class");
		greeter.greet(innerClassAnonymousGreeting);
		//		AddLambda addFunction = (int a, int b) -> a + b;


	}

}

//interface MyLamba{
//	
//	void foo();
//	
//}

//interface AddLambda{
//
//	int add(int a, int b);
//}