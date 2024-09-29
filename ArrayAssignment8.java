package Array_Assignment;

//8.Java program to count numbers of even and odd elements in an array

public class ArrayAssignment8 {
	public static void main(String[] args) {

		int[] arr = { 11, 12, 13, 14, 15, 16, 17, 18, 19 };

		int EvenCount = 0;
		int OddCount = 0;

		for (int i = 0; i < 9; i++) {
			if (arr[i] % 2 == 0)
				EvenCount++;
			else
				OddCount++;
		}
		System.out.println("Number Of Even Count: " + EvenCount);
		System.out.println("Number Of Odd Count:" + OddCount);
	}

}
