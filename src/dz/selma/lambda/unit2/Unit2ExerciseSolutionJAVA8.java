package dz.selma.lambda.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import dz.selma.lambda.unit1.Person;

public class Unit2ExerciseSolutionJAVA8 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Selma", "MOUZAOUI", 27),
				new Person("Omar", "OuledTaleb", 30),
				new Person("Hamza", "MOUZAOUI", 22),
				new Person("Amine", "OuledTaleb", 20)
				);

		//		Step 1: Sort List by last name
		Collections.sort(persons, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		//		Step 2: Create a method that prints all elements in the list
		System.out.println("Printing all persons");
		performConditionally(persons, p -> true, p -> System.out.println(p) );

		//		Step 3: Create a method that prints all people that have last name beginning with M
		//        printLastNameBeginnigWithM(persons);
		System.out.println("\n\nPersons that have last name start with M \"LAMBDA\" \n");
		performConditionally(persons, p -> p.getLastName().startsWith("M"), p -> System.out.println(p.getLastName()));
			
	}

	//	private static void printLastNameBeginnigWithM(List<Person> persons) {
	//		// TODO Auto-generated method stub
	//		System.out.println("\n\nPersons that have last name start with M\n");
	//		for (Person person : persons) {
	//			if (person.getLastName().startsWith("M"))
	//				System.out.println(person);
	//		}
	//	}

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
