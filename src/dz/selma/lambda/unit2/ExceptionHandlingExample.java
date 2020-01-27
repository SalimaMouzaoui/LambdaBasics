package dz.selma.lambda.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		int[] someNumbers = {1, 2, 3, 4};
		int key = 0;
		
		process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
//		{
//			try {
//				System.out.println(v / k);
//			} catch (ArithmeticException e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
//		});
				
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		// TODO Auto-generated method stub
		for (int i : someNumbers) {
			consumer.accept(i, key);
//			System.out.println(i * key);
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v, k) -> {
			try {
				consumer.accept(v, k);
			} catch (ArithmeticException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		//System.out.println(v / k);
		};
	}
}
