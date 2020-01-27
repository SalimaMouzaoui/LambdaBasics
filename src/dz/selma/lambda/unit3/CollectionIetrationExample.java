package dz.selma.lambda.unit3;

import java.util.Arrays;
import java.util.List;
import dz.selma.lambda.unit1.Person;

public class CollectionIetrationExample {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Selma", "MOUZAOUI", 27),
				new Person("Omar", "OuledTaleb", 30),
				new Person("Hamza", "MOUZAOUI", 22),
				new Person("Amine", "OuledTaleb", 20)
				);

		System.out.println("Using for in Loop");
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i));
		}

		System.out.println("Using for each Loop");
		for (Person person : persons) {
			System.out.println(person);
		}
		// using lambda expression
		System.out.println("Using lambda expression for each loop");
		persons.forEach(p -> System.out.println(p));

		// using function method
		System.out.println("Using function method for each loop");
		persons.forEach(System.out::println);
	}

}
