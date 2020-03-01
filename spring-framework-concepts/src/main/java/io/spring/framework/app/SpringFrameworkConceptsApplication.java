package io.spring.framework.app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.spring.framework.app.service.AServiceImpl;
import io.spring.framework.app.service.BService;

@SpringBootApplication
public class SpringFrameworkConceptsApplication implements CommandLineRunner {

    BService bService;
    AServiceImpl aService;

    public SpringFrameworkConceptsApplication(@Qualifier("bSer") BService bService, AServiceImpl aService) {
	this.bService = bService;
	this.aService = aService;
    }

    public static void main(String[] args) {
	SpringApplication.run(SpringFrameworkConceptsApplication.class, args);
    }

    public void perform() {
	aService.setBservice(bService);
	aService.fromAService();
    }

    @Override
    public void run(String... args) throws Exception {
	perform();
    }

}
