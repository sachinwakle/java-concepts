package io.spring.framework.app.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "bSer")
public class BServiceImpl implements BService {
    private String name = "sachin";

    @Override
    public void display() {
	System.out.println("Hello " + name + " from Class B");
    }

}
