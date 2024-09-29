/*
  Find the Fibonacci Series up to 8 No.
*/
package Array_Assignment;

public class ArrayAssignment5 {
	public static void main(String[] args) {
		int[] arr = new int[8];
		arr[0] = 0;
		arr[1] = 1;
		System.out.println(arr[0] + "\n" + arr[1]);
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			System.out.println(arr[i]);
		}
	}
}
