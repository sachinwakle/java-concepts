package io.spring.framework.app.service;

public interface BService {
    public void display();

    default public void perform() {
	System.out.println("performing from BService");
    }
}
