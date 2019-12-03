package io.sachin.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.sachin.lambda.functions.DisplayAll;
import io.sachin.lambda.model.Person;

public class Perform {

    public static void main(String[] args) {

	List<Person> persons = new ArrayList<Person>(Arrays.asList(new Person("Sachin", "Wakle", 27),
		new Person("Sachith", "R.", 25), new Person("Shiven", "P.", 26)));

	DisplayAll disp = pers -> persons
		.forEach(p -> System.out.println(p.getFirstName() + " " + p.getLastName() + "|" + p.getAge()));

	exeFuction(disp, persons);

	System.out.println("----[ Sorted List]------");
	exeFuction(pers -> pers.sort((o1, o2) -> o1.getAge() - o2.getAge()), persons);
	exeFuction(disp, persons);

	System.out.println("----[ Person's Last Name Start with - W]------");
	exeFuction(pers -> pers.removeIf(pr -> !pr.getLastName().startsWith("W")), persons);
	exeFuction(disp, persons);

    }

    public static void exeFuction(DisplayAll all, List<Person> person) {
	all.display(person);
    }

}
