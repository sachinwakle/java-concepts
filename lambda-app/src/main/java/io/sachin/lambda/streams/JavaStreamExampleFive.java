package io.sachin.lambda.streams;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class JavaStreamExampleFive {

    public static void main(String[] args) {
	System.out.println("---[ Reduction- summary statistics ]---");
	IntSummaryStatistics summary = IntStream.of(2, 3, 4, 1, 7, 5, 6).summaryStatistics();
	System.out.println(summary);
	System.out.println("\n");
    }
}
