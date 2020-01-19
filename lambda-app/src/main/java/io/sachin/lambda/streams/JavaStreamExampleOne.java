package io.sachin.lambda.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class JavaStreamExampleOne {

    public static void main(String[] args) {
	System.out.println("---[ Integer Stream ]---");
	IntStream.range(1, 10).forEach(System.out::print);
	System.out.println("\n");

	System.out.println("---[ Integer Stream with skip ]---");
	IntStream.range(1, 10).skip(4).forEach(i -> System.out.print(i + " "));
	System.out.println("\n");

	System.out.println("---[ Integer Stream with sum ]---");
	int sum = IntStream.range(1, 6).sum();
	System.out.println("sum = " + sum);
	System.out.println("\n");

	System.out.println("---[ Stream of Array- average of squares ]---");
	Arrays.stream(new int[] { 4, 5, 2, 3 }).map(x -> x * x).average().ifPresent(System.out::print);
	System.out.println("\n");
    }

}
