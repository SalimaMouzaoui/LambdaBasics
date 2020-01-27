package dz.selma.lambda.unit2;

public class ThisReferenceExample {

	public void doProcess(int i, Process process) {
		process.process(i);
	}
	public void doExecute() {
		doProcess(10, i -> {
			System.out.println("Value of i is "+ i);
			System.out.println(this);
		});
	}
	
	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
//		thisReferenceExample.doProcess(10, i -> {
//			System.out.println("Value of i is "+ i);
//			//System.out.println(this);
//		});
//				new Process() {
//			
//			@Override
//			public void process(int i) {
//				// TODO Auto-generated method stub
//				System.out.println("Value of i is "+ i);
//				System.out.println(this);
//			}
//			
//			public String toString() {
//				return "This is an annonymous inner class";
//			}
//		});
		thisReferenceExample.doExecute();
		
		
	}
	public String toString() {
		return "This is the main ThisReferenceExample class instance";
		
	}
	
}
