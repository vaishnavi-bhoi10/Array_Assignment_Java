/*6.Program to check Harshad number or not using Java
Hint: - Harshad number is a number or an integer in base 10 which is completely
divisible by sum of its digits.
Example: Suppose a number 24. Calculate the sum of digits of the number(2+4)=6.
Check whether the number entered by user is completely divisible by  
sum of its digits or not.*/

package Array_Assignment;

import java.util.Scanner;

public class ArrayAssignment6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int originalNum = num;
		int sumOfDigits = 0;

		while (num > 0) {
			int digit = num % 10;
			sumOfDigits += digit;
			num = num / 10;
		}

		if (originalNum % sumOfDigits == 0) {
			System.out.println(originalNum + " is a Harshad number.");
		} else {
			System.out.println(originalNum + " is not a Harshad number.");
		}
	}
}