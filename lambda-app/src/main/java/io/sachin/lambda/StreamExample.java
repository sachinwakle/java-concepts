package io.sachin.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.sachin.lambda.model.Person;

public class StreamExample {
    public static void main(String[] args) {
	List<Person> persons = Arrays.asList(new Person("sachin", "wakle", 27), new Person("nisar", "nadaf", 27),
		new Person("saurabh", "kurdukar", 27), new Person("akshay", "zagade", 25),
		new Person("pratap", "kale", 30), new Person("sachin", "patil", 35));

	System.out.println("---[ Stream Grouping ]---");
	Map<Integer, List<Person>> personsGroupByAge = persons.stream().collect(Collectors.groupingBy(Person::getAge));

	personsGroupByAge.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(q -> {
	    System.out.println("\n[ People belongs to age group of " + q.getKey() + " ]");
	    q.getValue().forEach(p -> System.out.println(p.getFirstName() + " " + p.getLastName()));
	});
    }
}
