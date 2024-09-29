/*
7.Java Program for Sorting first half in Ascending order and second half in 
Descending order
Example
Input: arr [6] = [1, 90, 34, 89, 7, 9]
Output: 1 7 9 90 89 34  */
package Array_Assignment;

import java.util.Arrays;

public class ArrayAssignment7 {
	public static void main(String[] args) {

		int[] arr = { 1, 90, 34, 89, 7, 9 };

		int n = arr.length;
		int mid = n / 2;

		Arrays.sort(arr);

		for (int i = mid; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Output: " + Arrays.toString(arr));
	}

}
