package javaCalculatorTTSHW;

import java.math.BigInteger;

public class MagicCalculator extends Calculator{

	// Create a MagicCalculator that inherits its basic functionality from your calculator and finds square root, sin, cos, tan, and factorial
	
	// square root Method
	public double squareRoot(double num3) {
	  double squareRoot = 0;
	  squareRoot = Math.pow(num3, 0.5);
	  return squareRoot;
	}
	
	// sin Method
	public double sin(double num4) {
		double sin = 0;
		double radians = Math.toRadians(num4);// convert degrees to radians
		sin = Math.sin(radians);
		return sin;
	}
	
	//cos Method
	public double cos(double num5) {
		double cos = 0;
		double radians = Math.toRadians(num5);
		cos = Math.cos(radians);
		return cos;
	}
	
	//tan Method
	public double tan(double num6) {
		double tan = 0;
		double radians = Math.toRadians(num6);
		tan = Math.tan(radians);
		return tan;
	}
	
	//factorial Method
	public BigInteger factorial(int num7) {
		BigInteger factorial = BigInteger.ONE;
		for (int i = 2; i <= num7; i++)
			factorial = factorial.multiply(BigInteger.valueOf(i));
		return factorial;
	
	}
}
