package problems;

import java.io.IOException;

import prime.PrimeCheck;
import prime.PrimeReader;

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
		maxIndex -= 2; // =545
		highestCount = maxIndex + 10;

		// initial window size = 546
		for (int windowSize = maxIndex - 0 + 1; windowSize < highestCount; windowSize--) {
			// determine window sum
			int windowSum = 0;
			for (int i = 0; i < windowSize; i++) {
				windowSum += primeArray[i];
			}
			// enter inner loop to window slide
			for(;;) {
				
			}
		}
s
		// System.out.println(highestCount);
	}

}
