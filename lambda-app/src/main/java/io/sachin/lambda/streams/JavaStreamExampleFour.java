package io.sachin.lambda.streams;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamExampleFour {

    public static void main(String[] args) throws IOException, URISyntaxException {
	System.out.println("---[ Stream rows from CSV file- count ]---");
	Stream<String> row = Files.lines(Paths.get(ClassLoader.getSystemResource("buildings.csv").toURI()));
	long rowCount = row.map(s -> s.split(",")).filter(s -> s.length == 3).count();
	System.out.println("Row Count: " + rowCount);
	row.close();
	System.out.println("\n");

	System.out.println("---[ Stream rows from CSV file- parse data ]---");
	Stream<String> building = Files.lines(Paths.get(ClassLoader.getSystemResource("buildings.csv").toURI()));
	building.map(s -> s.split(",")).filter(s -> s.length == 3).filter(a -> Integer.parseInt(a[2]) > 9)
		.forEach(p -> System.out.println(p[0] + " " + p[1] + " " + p[2]));
	building.close();
	System.out.println("\n");

	System.out.println("---[ Stream rows from CSV file- HashMap ]---");
	Stream<String> building1 = Files.lines(Paths.get(ClassLoader.getSystemResource("buildings.csv").toURI()));
	Map<String, String> buildingMap = building1.map(s -> s.split(",")).filter(s -> s.length == 3)
		.filter(a -> Integer.parseInt(a[2]) > 9).collect(Collectors.toMap(k -> k[0], v -> v[1]));
	building1.close();

	buildingMap.forEach((k, v) -> System.out.println(k + " " + v));
	System.out.println("\n");

    }

}
