package dz.selma.lambda.unit3;

import java.util.Arrays;
import java.util.List;

import dz.selma.lambda.unit1.Person;

public class StreamExample1 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Selma", "MOUZAOUI", 27),
				new Person("Omar", "OuledTaleb", 30),
				new Person("Hamza", "MOUZAOUI", 22),
				new Person("Amine", "OuledTaleb", 20)
				);

		persons.stream()
		.filter(p -> p.getLastName().startsWith("M"))
		.forEach(p -> System.out.println(p.getFirstName()));

		long count = persons.stream()
				.filter(p -> p.getLastName().startsWith("M"))
				.count();

		System.out.println(count);

		count = persons.parallelStream()
				.filter(p -> p.getLastName().startsWith("M"))
				.count();

		System.out.println(count);

	}
}
