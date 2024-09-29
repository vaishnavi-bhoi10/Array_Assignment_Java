/*9.Java program for rotation of elements of array- left and right. 
An array is said to be right rotated if all the selected elements were 
moved towards right by one position.*/

package Array_Assignment;
import java.util.Arrays;
public class ArrayAssignment9 
{
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = arr.length;

		System.out.println("Original Array: " + Arrays.toString(arr));

		int lastElement = arr[n - 1];
		for (int i = n - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = lastElement;
		System.out.println("After Right Rotation: " + Arrays.toString(arr));

		int firstElement = arr[0];
		for (int i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[n - 1] = firstElement;
		System.out.println("After Left Rotation: " + Arrays.toString(arr));
	}
}
/*
Original Array: [1, 2, 3, 4, 5, 6, 7, 8, 9]
After Right Rotation: [9, 1, 2, 3, 4, 5, 6, 7, 8]
After Left Rotation: [1, 2, 3, 4, 5, 6, 7, 8, 9]
*/