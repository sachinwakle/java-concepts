package io.sachin.lambda;

public class Closure {

    public void doPerform(int i, Process p) {
	p.process(i);
    }

    @Override
    public String toString() {
	return "from closure";
    }

    public void execute() {
	Closure cl = new Closure();
	cl.doPerform(3, i -> {
	    System.out.println(i);
	    System.out.println(this);
	});
    }

    public static void main(String[] args) {

	int q = 2;
	Closure cl = new Closure();
	cl.execute();

    }
}

interface Process {
    void process(int i);
}