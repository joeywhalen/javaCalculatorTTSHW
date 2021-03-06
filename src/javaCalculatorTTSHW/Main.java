package javaCalculatorTTSHW;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 4;
		double num3 = 9;
		double num4 = 45.0;
		double num5 = 15.0;
		double num6 = 30.0;
		int num7 = 5;
		
		Calculator math = new Calculator();
		
		int addResult = math.add(num1, num2);
		System.out.printf("The sum of %s + %s is: %s\n", num1, num2, addResult);
		
		int subtractResult = math.subtract(num1, num2);
		System.out.printf("The difference of %s - %s is: %s\n", num1, num2, subtractResult);
		
		int multiplyResult = math.multiply(num1, num2);
		System.out.printf("The product of %s * %s is: %s\n", num1, num2, multiplyResult);
		
		int divideResult = math.divide(num1, num2);
		System.out.printf("The quotient of %s / %s is: %s\n", num1, num2, divideResult);
		
		int squareResult = math.square(num1);
		System.out.printf("The square of %s is: %s\n", num1, squareResult);
		
		MagicCalculator Magicmath = new MagicCalculator();
		
		double squareRootResult = Magicmath.squareRoot(num3);
		System.out.printf("The square root of %s is: %s\n", num3, squareRootResult);
		
		double sinResult = Magicmath.sin(num4);
		System.out.printf("The sin of %s degrees is: %s\n", num4, sinResult);
		
		double cosResult = Magicmath.cos(num5);
		System.out.printf("The cosine of %s degrees is: %s\n", num5, cosResult);
		
		double tanResult = Magicmath.tan(num6);
		System.out.printf("The tangent of %s degrees is: %s\n", num6, tanResult);
		
		BigInteger factorialResult = Magicmath.factorial(num7);
		System.out.printf("The factorial of %s is: %s\n", num7, factorialResult);

	}

}
