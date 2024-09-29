//2.Reverse a given Array and print.
package Array_Assignment;

import java.util.Arrays;

public class ArrayAssignment2 {

	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 44, 55, 66 };
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println("Output: " + Arrays.toString(arr));
	}

}