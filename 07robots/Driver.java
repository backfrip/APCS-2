public class Driver {
    public static void main(String[] args) {
	MyLinkedList<Integer> piper = new MyLinkedList<Integer>();

	piper.add(0);
	piper.add(1);
	piper.remove();
	piper.add(2);
	System.out.println(piper); // expect [1, 2]

	piper.clear();
	piper.add(0);
	piper.remove();
	piper.add(1);
	piper.add(2);
	System.out.println(piper); // expect [1, 2]
	
	piper.clear();
	piper.add(0);
	piper.add(1);
	piper.add(2, 2);
	piper.add(3);
	System.out.println(piper); // expect [0, 1, 2, 3]
	
	piper.set(3, 4);
	System.out.println(piper); // expect [0, 1, 2, 4]
	
	piper.clear();
	piper.add(0);
	piper.add(1);
	piper.add(2);
	piper.remove(new Integer(1));
	piper.add(3);
	System.out.println(piper); // expect [0, 2, 3]
	
	piper.add(50);
	piper.add(60);
	piper.add(70);
	piper.add(80);
	piper.add(90);
	
	System.out.println("BigWeld's Numbas: ");
	for (int rodney : piper) {
	    System.out.print(rodney + " ");
	}
    }
}