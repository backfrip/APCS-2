import java.util.*;

public class QuickAttack {
    void partition(int[] ary, int si, int ei) {
	int[] D = new int[ary.length];

	for (int i = 0; i < ary.length; i++) {
	    D[i] = ary[i];
	}

	System.out.println(Arrays.toString(D));

	int pivot = ary[si + (int)(Math.random() * (ei - si + 1))];
	int start = si;
	int end = ei;
	
	System.out.println(pivot);

	for (int i = 0; i < D.length; i++) {
	    if (ary[i] < pivot) {
		D[si] = ary[i];
		si++;
	    } else if (ary[i] > pivot) {
		D[ei] = ary[i];
		ei--;
	    }
	}

	System.out.println(Arrays.toString(D));

    }

    public static void main(String[] args) {
	QuickAttack lightning = new QuickAttack();

	int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	lightning.partition(a, 0, 9);
    }
}