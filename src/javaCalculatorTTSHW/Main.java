package javaCalculatorTTSHW;

public class Main {

	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 4;
		
		Calculator math = new Calculator();
		
		int addResult = math.add(num1, num2);
		System.out.println("The sum is: " + addResult);
		
		int subtractResult = math.subtract(num1, num2);
		System.out.println("The difference is " + subtractResult);
		
		int multiplyResult = math.multiply(num1, num2);
		System.out.println("The product is " + multiplyResult);
		
		int divideResult = math.divide(num1, num2);
		System.out.println("The quotient is " + divideResult);
		
		int squareResult = math.square(num1, num2);
		System.out.println("The square is " + squareResult);

	}

}
