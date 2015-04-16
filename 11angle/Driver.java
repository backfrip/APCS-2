public class Driver {
    public static void main(String[]args) {
	Maze maiz = new Maze("damaze");
	System.out.println(maiz.toString(true));
	Frontier<Integer> front = new Frontier<Integer>(true, 1);
	front.addFirst(10, 6);
	front.addFirst(12, 5);
	front.addLast(16, 10);
	System.out.println(front);
	front.removeFirst();
	System.out.println(front);
	front.removeLast();
	System.out.println(front);
    }
}