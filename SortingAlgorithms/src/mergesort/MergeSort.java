package mergesort;

public class MergeSort {

	public static void merge(int[] A, int left , int middle, int right) {
		int[] leftTempArray = new int[middle-left+2];
		int[] rightTempArray = new int[right - middle+1];
		
		for(int i = 0; i <= middle-left; i++) {
			leftTempArray[i] = A[left+i];
		}
		
		for(int i = 0; i< right-middle; i++) {
			rightTempArray[i] = A[middle + 1 +i];
		}
		
		leftTempArray[middle-left+1] = Integer.MAX_VALUE;
		rightTempArray[right-middle] = Integer.MAX_VALUE;
		
		int i = 0;
		int j = 0;
		
		for(int k = left; k <= right; k++) {
			if(leftTempArray[i] < rightTempArray[j]) {
				A[k] = leftTempArray[i];
				i++;
			} else {
				A[k] = rightTempArray[j];
				j++;
			}
		}
		
		
		
	}
	
	public static void mergeSort(int[] Array, int left, int right) {
		if(right > left) {
			int m = (left+right)/2;
			mergeSort(Array, left, m);
			mergeSort(Array, m+1, right);
			merge(Array, left, m, right);
		}
	}
	
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}
	
}
