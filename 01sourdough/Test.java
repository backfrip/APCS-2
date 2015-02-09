public class Test {
    public static void main(String[] args) {
	Recursion recurser = new Recursion();

	System.out.println(recurser.name());
	System.out.println(recurser.fact(0));
	System.out.println(recurser.fact(1));
	System.out.println(recurser.fact(5));
	try {
	    System.out.println(recurser.fact(-1));
	} catch (IllegalArgumentException e) {
	    System.err.println(e);
	}

	System.out.println(recurser.fib(0));
	System.out.println(recurser.fib(2));
	System.out.println(recurser.fib(5));
	System.out.println(recurser.fib(10));
	try {
	    System.out.println(recurser.fib(-1));
	} catch (IllegalArgumentException e) {
	    System.err.println(e);
	}

	System.out.println(recurser.sqrt(169.0));
	System.out.println(recurser.sqrt(1.0));
	System.out.println(recurser.sqrt(1.0E-8));
	System.out.println(recurser.sqrt(0.0));
	try {
	    System.out.println(recurser.sqrt(-1.0));
	} catch (IllegalArgumentException e) {
	    System.err.println(e);
	}
    }
}