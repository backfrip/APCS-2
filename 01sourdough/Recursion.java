public class Recursion implements hw1 {
    public String name() {
	return "Stringham,Eric";
    }

    public int fact(int n) {
	if (n < 0)
	    throw new IllegalArgumentException();
	if (n < 2)
	    return n;
	return n * fact(n - 1);
    }

    public int fib(int n) {
	if (n < 0)
	    throw new IllegalArgumentException();
	if (n < 2)
	    return n;
	return fib(n - 1) + fib(n - 2);
    }

    public double sqrt(double n) {
	if (n < 0)
	    throw new IllegalArgumentException();
	return sqrl(n, n / 2);
    }

    private double sqrl(double n, double guess) {
	if (n - (guess * guess) <= 0.00001 && n - (guess * guess) >= -0.00001) {
	    return guess;
	}
	return sqrl(n, (n / guess + guess) / 2);
    }
}