public class bubbleSort {
	public static void main(String[] args) {
		int[] x = {3, 1, 6, 7, 1, 2};
		while (isSorted(sort(x)) == false) {
			isSorted(sort(x));
		}
	}

	public static int[] sort(int[] x) {
		for (int i=0; i<x.length-1; i++) {
			if (i != x.length-1 && x[i] > x[i+1]) {
				int temp = x[i];
				x[i] = x[i+1];
				x[i+1] = temp;
				i = 0;
			}
		}
		return x;
	}

	public static boolean isSorted(int[] test) {
		for (int i = 0; i < test.length - 1; i++) {
			if (test[i] <= test[i+1]) {
				
			} else {
				return false;
			}
		}
		for (int q = 0; q<test.length; q++) {
			System.out.print(test[q]);
		}
		System.out.println();
		return true;
	}
}