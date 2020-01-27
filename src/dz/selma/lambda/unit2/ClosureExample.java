package dz.selma.lambda.unit2;

public class ClosureExample {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		doProcess(a, i -> System.out.println(i + b));
//				new Process() {
//			
//			@Override
//			public void process(int i) {
//				// TODO Auto-generated method stub
//				i = 15;
//				System.out.println(i + j);
//			}
//		});
	}
	
	public static void doProcess(int i, Process process) {
		process.process(i);
	}
	
}
interface Process{
	void process(int i);
}