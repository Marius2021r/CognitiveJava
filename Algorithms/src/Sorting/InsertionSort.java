package Sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int num[] = {100,20,15,18,98,0};
		System.out.println( " Original array  " +Arrays.toString(num));
		insertionSort(num);
		System.out.println( " Sorted array using Insertion sort " +Arrays.toString(num));
	}
	
	public static int [] insertionSort(int arr[])
	{
		for (int i=1; i< arr.length; i++) 
		{
			int sort = arr[i]; // starting with second element of array num[] 20 in this case.
			int j;
			for (j=i; j>0 && arr[j-1]> sort; j--) 
			{
				arr[j]= arr[j-1];
				
			}
			arr[j]=sort;
		}
		return arr;
	}		
	

}
