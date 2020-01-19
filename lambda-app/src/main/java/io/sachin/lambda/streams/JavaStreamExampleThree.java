package io.sachin.lambda.streams;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamExampleThree {
    public static void main(String[] args) throws IOException, URISyntaxException {
	System.out.println("---[ Stream rows from txt file- sort, filter, print ]---");
	Stream<String> row = Files.lines(Paths.get(ClassLoader.getSystemResource("brands.txt").toURI()));
	row.filter(s -> s.length() > 7).sorted().forEach(System.out::println);
	System.out.println("\n");
	row.close();

	System.out.println("---[ Stream rows from txt file- sort, filter, list ]---");
	Stream<String> brands = Files.lines(Paths.get(ClassLoader.getSystemResource("brands.txt").toURI()));
	List<String> brandList = brands.filter(s -> s.contains("da")).collect(Collectors.toList());
	brandList.forEach(System.out::println);
	System.out.println("\n");
	brands.close();
    }
}
