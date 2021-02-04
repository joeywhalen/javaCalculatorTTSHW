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
	
	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 4;
		
		Calculator math = new Calculator();
		
		int addResult = math.add(num1, num2);
		System.out.println(" The sum is: " + addResult);
		
		int subtractResult = math.subtract(num1, num2);
		System.out.println("The difference is " + subtractResult);
		
		int multiplyResult = math.multiply(num1, num2);
		System.out.println("The product is " + multiplyResult);
		
		int divideResult = math.divide(num1, num2);
		System.out.println("The quotient is " + divideResult);
		
	}
}
