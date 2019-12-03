package io.sachin.lambda.functions;

import java.util.List;
import io.sachin.lambda.model.Person;

@FunctionalInterface
public interface DisplayAll {

    public void display(List<Person> person);
}
