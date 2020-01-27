package dz.selma.lambda.unit1;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Printed inside Runnable");
				
			}
		});
		
		thread.run();
		
		
		Thread thread2 = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
		thread2.run();
		
	}

}
