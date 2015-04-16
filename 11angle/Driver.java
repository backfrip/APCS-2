public class Driver {
    public static void main(String[] args) {
	Maze maiz = new Maze("damaze");
	System.out.println(maiz.toString(true));
	Frontier<Integer> front = new Frontier<Integer>(true, 1);
	front.addFirst(10, 6);
	front.addFirst(12, 5);
	front.addLast(16, 10);
	System.out.println(front + "\n");
	front.removeFirst();
	System.out.println(front + "\n");
	front.removeLast();
	System.out.println(front + "\n");
	front.addLast(20, 20);
	front.addLast(34817212, 100);
	System.out.println(front);
	System.out.println(front.removeLeast());
	System.out.println(front.removeLeast() + "\n");
	System.out.println(front + "\n");
	front.addFirst(213, 0);
	front.addFirst(38921, 3);
	front.addFirst(2, 2);
	System.out.println(front);
	System.out.println(front.removeGreatest());
	System.out.println(front.removeGreatest() + "\n");
	System.out.println(front);
    }
}