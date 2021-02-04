package javaCalculatorTTSHW;

public class Calculator {
	
	// create a Java Calculator that adds, subtracts, multiplies, divides and gets the square of two integers.

	// add Method
	public static int add(int num1, int num2) {
		int add = 0;
		add = num1 + num2;
		return add;
	}
	
	// subtract Method
	public static int subtract(int num1, int num2) {
		int subtract = 0;
		subtract = num1 - num2;
		return subtract;
	}
	
	// multiply Method
	public static int multiply(int num1, int num2) {
		int multiply = 0;
		multiply = num1 * num2;
		return multiply;
	}
	
	// division Method
	public static int divide(int num1, int num2) {
		int divide = 0;
		divide = num1 / num2;
		return divide;
	}
	
	// square Method
	public static int square(int num1) {
		int square = 0;
		square = num1 * num1;
		return square;
	}
	
}
