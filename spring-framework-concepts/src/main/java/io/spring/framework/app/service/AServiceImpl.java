package io.spring.framework.app.service;

import org.springframework.stereotype.Component;

@Component
public class AServiceImpl {
    private BService bservice;

    public void fromAService() {
	System.out.println("From A service calling...");
	bservice.Display();
    }

    public void setBservice(BService bservice) {
	this.bservice = bservice;
    }

}
