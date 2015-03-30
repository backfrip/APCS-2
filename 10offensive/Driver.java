public class Driver {
    public static void main(String[]args) {
	MyDeque<Integer> deck = new MyDeque<Integer>(10);
	for (int i = 0; i < 9; i++) {
	    deck.addFirst(0);
	}
	deck.addLast(1);
	deck.addLast(2);
	deck.addFirst(17);
	System.out.println(deck.removeFirst());
	deck.addFirst(18);
	System.out.println(deck);
	System.out.println(deck.removeLast());
	System.out.println(deck);
	deck.removeFirst();
	System.out.println(deck.getFirst());
	System.out.println(deck.getLast());
    }
}