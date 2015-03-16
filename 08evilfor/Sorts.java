public class Sorts {
    public static void merge(int[] list) {

    }



    public static void quick(int[] list) {
	partition(list, 0, list.length - 1);
    }

    private static void partition(int[] list, int start, int end) {
	if (end - start < 1)
	    return;

	int h;
	int pivot = start + (int) (Math.random() * (end - start + 1));

	h = list[pivot];
	list[pivot] = list[end];
	list[end] = h;

	int si = start;
	int ei = end - 1;

	while (si < ei) {
	    if (list[si] <= list[end]) {
		si++;
	    } else {
		h = list[si];
		list[si] = list[ei];
		list[ei] = h;
		ei--;
	    }
	}

	if (list[si] > list[end])
	    pivot = si;
	else
	    pivot = si + 1;
	h = list[pivot];
	list[pivot] = list[end];
	list[end] = h;
	
	partition(list, start, pivot - 1);
	partition(list, pivot + 1, end);
    }



    public static void radix(int[] list) {

    }
}