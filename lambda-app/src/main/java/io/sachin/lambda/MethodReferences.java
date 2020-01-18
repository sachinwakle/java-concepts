package io.sachin.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import io.sachin.lambda.model.Person;

public class MethodReferences {

    public static void main(String[] args) {

	Person p1 = new Person("sachin", "wakle", 27);
	doProcess(p1, System.out::println);

	List<Person> persons = Arrays.asList(new Person("Nisar", "Nadaf", 28), p1);

	System.out.println("--- forEach Loop ---");
	persons.forEach(MethodReferences::operatePerson);

	System.out.println("--- Streams ---");
	persons.stream().filter(p -> p.getFirstName().startsWith("s")).forEach(System.out::println);
	Map<String, Person> personMap = persons.stream()
		.collect(Collectors.toMap(Person::getFirstName, Person -> Person));
	System.out.println("--- Map ---");
	personMap.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
    }

    public static void operatePerson(Person p) {
	System.out.println(
		p.getFirstName().toUpperCase(Locale.US) + " is " + (30 - p.getAge()) + " years to complete 30 age.");
    }

    public static void doProcess(Person p, ExeObj s) {
	s.exe(p);
    }

}

interface ExeObj {
    void exe(Person p);
}
