import java.util.*;

public class Driver {
    public static void main(String[] args) {
	MyLinkedList<Integer> testSyntax = new MyLinkedList<Integer>();
	testSyntax.add(1);
	testSyntax.add(2);
	testSyntax.add(3);
	testSyntax.add(4);
	testSyntax.add(5);
	for (int test : testSyntax) {
	    System.out.println(test);
	}
	// The new syntax works!
    }
}