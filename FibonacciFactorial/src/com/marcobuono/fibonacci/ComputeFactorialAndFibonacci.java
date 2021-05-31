package com.marcobuono.fibonacci;

/**
 * Compute Factorial and Fibonacci n
 * for a given non-negative integer provided
 * by the user
 * 
 * @author marcobuono
 *
 */
public class ComputeFactorialAndFibonacci {
	
	public static void main(String[] args) {
		int num = 0;
		while(true) { // ask until the value is correct
			System.out.print("Give me a non-negative integer: ");
			num = TextIO.getlnInt();
			if(num >= 0) {
				break;
			}
		}
		System.out.println("Factorial of " + num + " is " + factorial(num));
		System.out.println("The " + num + "th Fibonacci number is " + fibonacci(num));
		
	}
	
	/**
	 * This function compute the Factorial of a given number.
	 * The number should be a non-negative integer.
	 * 
	 * @param num the number to calculate the factorial of
	 * @return the factorial number
	 */
	public static int factorial(int num) {
		if(num == 0) {
			return 1;
		} else {
			return(num * factorial(num - 1));
		}
	}
	
	/**
	 * This function compute the Fibonacci number of a given number.
	 * The number should be a non-negative integer.
	 * 
	 * @param num the number to calculate the Fibonacci number of
	 * @return the Fibonacci number
	 */
	public static int fibonacci(int num) {
		if(num == 0 | num == 1) {
			return 1;
		} else {
			return(fibonacci(num - 1) + fibonacci(num - 2));
		}
	} 

}