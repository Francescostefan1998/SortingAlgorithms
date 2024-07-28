package main;

import bubblesort.BubbleSort;
import bucketsort.BucketSort;
import insertionsort.InsertionSort;
import mergesort.MergeSort;
import selectionsort.SelectionSort;

public class Main {
	
	
	public static void main(String[] args) {
		int arr[] = {10, 5, 30, 15, 50 , 6};
		MergeSort.mergeSort(arr, 0, arr.length - 1);
		MergeSort.printArray(arr);
	}

}
