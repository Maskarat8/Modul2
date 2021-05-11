package conko;

public class Performance2 {
	
	public static String formatHeader = "%-12s%-10s%-10s%-10s%-10s%n";
	public static String formatTimeData = "%, -12d%-10d%-10d%-10d%-10d%n";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf(formatHeader, "Array size", "Bubble", "Selection", "Merge", "Quick");
		
		compareSortingForNElements(50000);
		
		
	}
	
	public static void compareSortingForNElements(int n) {
		int[] arrB = new int[n];
		double[] arrS = new double[n];
		int[] arrM = new int[n];
		int[] arrQ = new int[n];
		
		for(int i = 0; i<n; i++) {
			int element = (int) (Math.random() *1000);
			arrB[i] = element;
			arrS[i] = element;
			arrM[i] = element;
			arrQ[i] = element;
		}
		
		long timeB = 0, timeS = 0, timeM = 0, timeQ = 0;
		
		long currentTime = System.currentTimeMillis();
		BubbleSort.bubbleSort(arrB);
		timeB = System.currentTimeMillis() - currentTime;
		
		currentTime = System.currentTimeMillis();
		SelectionSort.selectionSort(arrS);
		timeS = System.currentTimeMillis() - currentTime;
		
		currentTime = System.currentTimeMillis();
		MergeSort.mergeSort(arrM);
		timeM = System.currentTimeMillis() - currentTime;
		
		currentTime = System.currentTimeMillis();
		QuickSort.quickSort(arrQ);
		timeQ = System.currentTimeMillis() - currentTime;
		
		System.out.printf(formatTimeData, n, timeB, timeS, timeM, timeQ);
	}

}
