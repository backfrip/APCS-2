public class Driver {
    public static void main(String[]args) {
	MyLinkedList fender = new MyLinkedList();
	System.out.println(fender + ", " + fender.size());
	fender.add(1);
	System.out.println(fender + ", " + fender.size());
	fender.add(2);
	System.out.println(fender + ", " + fender.size());
	fender.add(2, 3);
	System.out.println(fender + ", " + fender.size());
	fender.remove();
	System.out.println(fender + ", " + fender.size());
	fender.remove();
	System.out.println(fender + ", " + fender.size());
	fender.remove();
	System.out.println(fender + ", " + fender.size());
    }
}