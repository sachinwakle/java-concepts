package io.sachin.lambda.functions;

import io.sachin.lambda.model.Person;

public interface Condition {
    public boolean test(Person person);
}
