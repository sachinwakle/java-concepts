package io.sachin.lambda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamExampleTwo {

    public static void main(String[] args) {
	System.out.println("---[ Stream.of - sorted and findFirst ]---");

	Stream.of("supriya", "Sachin", "saurabh", "sheetal").sorted().findFirst().ifPresent(System.out::print);
	System.out.println("\n");

	System.out.println("---[ Stream of Array - filter, sorted ]---");

	String[] names = new String[] { "supriya", "Sachin", "nisar", "akshay", "akshata", "saurabh", "sheetal" };
	Arrays.stream(names).filter(s -> s.startsWith("s")).sorted().forEach(System.out::println);
	System.out.println("\n");

	System.out.println("---[ Stream of List - filter, map ]---");
	List<String> nameList = Arrays.asList("supriya", "Sachin", "nisar", "akshay", "akshata", "saurabh", "sheetal");
	nameList.parallelStream().map(String::toLowerCase).filter(s -> s.startsWith("s")).forEach(System.out::println);
	System.out.println("\n");

    }

}
