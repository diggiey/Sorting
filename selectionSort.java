public class selectionSort {
	public static void main(String[] args) {
		int[] x = {3, 1, 6, 7, 1, 2};
		while (isSorted(sort(x)) == false) {
			isSorted(sort(x));
		}
	}

	public static int[] sort(int[] x) {
		for (int i=0; i<x.length-1; i++) {
		       int minIndex = i;
		       for (int j=i+1; j<x.length; j++) {
		           if (x[minIndex] > x[j]) {
		               minIndex = j;
		           }
		       }
		       if (minIndex != i) { 
		           int temp = x[i];
		           x[i] = x[minIndex];
		           x[minIndex] = temp;
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