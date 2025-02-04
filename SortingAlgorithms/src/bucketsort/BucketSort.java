package bucketsort;
import java.util.*;
public class BucketSort {

	int arr[];
	
	
	public BucketSort(int arr[]) {
		this.arr = arr;
	}
	
	public void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	// helper method to see the bucket in the console
	public void printBucket(ArrayList<Integer>[] buckets) {
		for(int i = 0; i<buckets.length; i ++) {
			System.out.println("\nBucket" + i + ":");
			for(int j = 0; j<buckets[i].size(); j++) {
				System.out.print(buckets[i].get(j) + " ");
			}
		}
	}
	
	public void bucketSort() {
		int numberOfBucket = (int) Math.ceil(Math.sqrt(arr.length));
		int maxValue = Integer.MIN_VALUE;
		for(int value: arr) {
			if(value > maxValue) {
				maxValue = value;
			}
		}
		
		ArrayList<Integer>[] buckets = new ArrayList[numberOfBucket];
		for(int i = 0; i < buckets.length; i++) {
			buckets[i] = new ArrayList<Integer>();
		}
		
		for(int value: arr) {
			int bucketNumber = (int) Math.ceil(((float)value * numberOfBucket)/(float)maxValue);
			buckets[bucketNumber -1].add(value);
		}
		
		System.out.println("\n\nPrinting buckets before sorting");
		printBucket(buckets);
		
		for(ArrayList<Integer> bucket: buckets) {
			Collections.sort(bucket);
		}
		
		System.out.println("\n\nPrinting buckets before sorting");
		printBucket(buckets);
		
		int index = 0;
		for(ArrayList<Integer> bucket: buckets) {
			for(int value: bucket) {
				arr[index] = value;
				index++;
			}
		}
		
		
	}
	
	
	
	
}
