package io.sachin.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import io.sachin.lambda.functions.Condition;
import io.sachin.lambda.model.Person;

public class PerformVer2 {

    public static void main(String[] args) {
	List<Person> persons = new ArrayList<Person>(Arrays.asList(new Person("Sachin", "Wakle", 27),
		new Person("Sachith", "R.", 25), new Person("Shiven", "P.", 26)));

	printConditionally(persons, p -> true);

	// Problem 1: Sort By Last Name
	System.out.println("\nSort by LastName");
	Collections.sort(persons, new Comparator<Person>() {

	    @Override
	    public int compare(Person o1, Person o2) {
		return o1.getLastName().compareToIgnoreCase(o2.getLastName());
	    }
	});
	printConditionally(persons, p -> true);

	// Problem 2: Sort By FirstName
	System.out.println("\nSort By FirstName");
	Collections.sort(persons, (p1, p2) -> p1.getFirstName().compareToIgnoreCase(p2.getFirstName()));
	printConditionally(persons, p -> true);

	// Problem 3: Print all start last name with "W"
	System.out.println("\nPrint all start last name with \"W\"");
	printConditionally(persons, p -> p.getLastName().startsWith("W"));

	// Problem 3: Print all end first name with "n"
	System.out.println("\nPrint all end first name with \"n\"");
	printConditionally(persons, p -> p.getFirstName().endsWith("n"));

    }

    public static void printConditionally(List<Person> persons, Condition condition) {
	for (Person person : persons) {
	    if (condition.test(person)) {
		System.out.println(person);
	    }
	}
    }

}
