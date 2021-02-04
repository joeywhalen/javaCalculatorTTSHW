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
	
	
	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 8;
		
		Calculator sum = new Calculator();
		
		int result = sum.add(num1, num2);
		System.out.printf(" The sum is: " + result);
	}
}
