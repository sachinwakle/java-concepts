package io.sachin.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
	List<Integer> numberList = Arrays.asList(2, 1, 4, 5, 3);

	perform(numberList, 0, wrapperLambda((i, key) -> System.out.println(i / key)));

    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
	return (i, k) -> {
	    try {
		biConsumer.accept(i, k);
	    } catch (ArithmeticException e) {
		System.out.println("Arithmetic exception caught in lambda wrapper.");
	    }
	};

    }

    private static void perform(List<Integer> numberList, Integer key, BiConsumer<Integer, Integer> biConsumer) {
	for (Integer i : numberList) {
	    biConsumer.accept(i, key);
	}
    }

}
