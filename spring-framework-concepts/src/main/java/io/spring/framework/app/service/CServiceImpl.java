package io.spring.framework.app.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "cSer")
public class CServiceImpl implements BService {

    @Override
    public void Display() {
	System.out.println("From C Service...");
    }

}
