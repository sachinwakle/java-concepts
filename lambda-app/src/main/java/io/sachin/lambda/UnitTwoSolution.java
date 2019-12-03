package io.sachin.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import io.sachin.lambda.model.Person;

public class UnitTwoSolution {

    public static void main(String[] args) {
	List<Person> persons = new ArrayList<Person>(Arrays.asList(new Person("Sachin", "Wakle", 27),
		new Person("Sachith", "R.", 25), new Person("Shiven", "P.", 26)));

	System.out.println("Print all persons");
	performConditionally(persons, p -> true, p -> System.out.println(p));

	System.out.println("\nPrint all persons whose last name start with \"W\"");
	performConditionally(persons, p -> p.getLastName().startsWith("W"), p -> System.out.println(p));

	System.out.println("\nPrint all persons whose first name ends with \"n\"");
	performConditionally(persons, p -> p.getFirstName().endsWith("n"), p -> System.out.println(p.getFirstName()));

    }

    /**
     * 
     * @param persons
     * @param predicate - functional interface, available as out of the box which
     *                  contain test method which returns boolean type
     * @param consumer  - functional interface, available as out of the box which
     *                  contain accept method which takes single argument and
     *                  returns nothing
     */
    public static void performConditionally(List<Person> persons, Predicate<Person> predicate,
	    Consumer<Person> consumer) {
	for (Person person : persons) {
	    if (predicate.test(person)) {
		consumer.accept(person);

	    }
	}
    }

}
