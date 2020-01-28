package problems;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.*;

import prime.PrimeCheck;
import prime.PrimeReader;

/*
The prime 41, can be written as the sum of six consecutive primes:

41 = 2 + 3 + 5 + 7 + 11 + 13
This is the longest sum of consecutive primes that adds to a prime below one-hundred.

The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.

Which prime, below one-million, can be written as the sum of the most consecutive primes?
 */

public class Problem50 {
	public static void calc() throws IOException {
		int[] primeArray = PrimeReader.getPrimeInt();
		int sum = 0;
		int maxIndex;
		int highestCount = 0;
		
		// determine maxIndex
		for (maxIndex = 0; sum < 1000000; maxIndex++) {
			sum += primeArray[maxIndex];
		}
		// sum = 997661
		maxIndex -= 2; // maxIndex=545
		highestCount = 0;
		boolean found = false;

		// initial window size = 546
		for (int windowSize = maxIndex + 1; (windowSize < highestCount) || (found == false); windowSize--) {
			// determine window sum
			int windowSum = 0;
			// enter inner loop to window slide
			for (int i = 0; i + windowSize < maxIndex + 1; i++) {
				// calculate window sum (int startInclusive, int endExclusive)
				windowSum = Arrays.stream(primeArray, i, windowSize).sum(); 
				// determine if sum is a prime
				if (PrimeCheck.check(windowSum)) {
					highestCount = windowSum;
					found = true;
					
				}
			}
		}
		
		
		System.out.println(highestCount);
	}

}
