/**
 * 
 */
package edu.ddiaz.ant.app;

/**
 * @author Daniel Diaz
 * @version 2017.09.09
 * 
 */
public class SieveOfErastosthenesApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Say hi
		System.out.println("Hello there!!");
		System.out.println("Welcome to the Sieve of Erastosthenes App");

		// show max arg
		int max = Integer.parseInt(args[0]);
		System.out.println("Max is " + max);

		// print prime numbers
		PrintPrimeNumbers(max);

	}

	private static void PrintPrimeNumbers(int max) {
		// TODO Auto-generated method stub
		int[] tmpArray = new int[max + 1];
		int primeCtr = 0;

		for (int i = 2; i <= Math.sqrt(max); i++) {
			if (tmpArray[i] == 0) {
				for (int j = i * i; j <= max; j += i) {
					tmpArray[j] = 1;
				}
				
				if (tmpArray[i] == 0 ) {
					
				}
			}
		}

		int[] primeArray = tmpArray;
		for (int i = 2; i < primeArray.length; i++) {
			if (primeArray[i] == 0) {
				System.out.print(i + ", ");
				primeCtr++;
			}
		}
		System.out.print("count = " + primeCtr);

	}

}
