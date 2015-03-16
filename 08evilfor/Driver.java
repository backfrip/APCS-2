import java.util.*;

public class Driver {
    public static void main(String[] args) {
	int[] test = { 23, 234, -174, -168, 144, 3788, -1884, 3921, 3, -193, 0 };
	Sorts.quick(test);
	System.out.println(Arrays.toString(test));
    }
}