public class QDriver4 {
    public static void main(String[]args) {
	NQueens t = new NQueens(6);
	if (t.solve())
	    System.out.println(t);
	else
	    System.out.println("Cannot solve");
    }
}