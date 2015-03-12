public class Driver {
    public static void main(String[]args) {
	MyLinkedList fender = new MyLinkedList();
	fender.add(1);
	fender.add(2);
	fender.add(3, 3);
	System.out.println(fender);
    }
}