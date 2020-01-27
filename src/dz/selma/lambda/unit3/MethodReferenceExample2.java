package dz.selma.lambda.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import dz.selma.lambda.unit1.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Selma", "MOUZAOUI", 27),
				new Person("Omar", "OuledTaleb", 30),
				new Person("Hamza", "MOUZAOUI", 22),
				new Person("Amine", "OuledTaleb", 20)
				);

		//		Step 2: Create a method that prints all elements in the list
		System.out.println("Printing all persons");
		// p -> method(p) => method
		performConditionally(persons, p -> true, System.out::println ); 

	}
	
	private static void performConditionally(List<Person> persons, 
			Predicate<Person> predicate,
			Consumer<Person> consumer) {
		// TODO Auto-generated method stub
		
		for (Person person : persons) {
			if (predicate.test(person))
				consumer.accept(person);
		}
	}
}
