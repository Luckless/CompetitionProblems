package com.codeeval.easy;

/**
 * Sum of First 1000 Primes
 * {@link https://www.codeeval.com/open_challenges/4/} 
 * 
 * @author Dakota
 *
 */
public class SumOfPrimes {
    public static void main(final String[] args) {
        int sum = 0;

        for (int i = 2, primeCount = 0; primeCount < 1000; i++) {
                if (isPrime(i)) {
                        sum += i;
                        primeCount++;
                }
        }

        System.out.println(sum);
    }
	
	public static boolean isPrime(int i){
		for(int j = 2; j < (i/2 + 1); j++){
			if(i%j == 0){
				return false;
			}
		}
		return true;
	}
}
