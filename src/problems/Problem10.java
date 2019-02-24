package problems;

import java.io.IOException;

import prime.PrimeReader;

public class Problem10 {
	public static void calc() throws IOException {
		int[] prime = PrimeReader.getPrimeInt();
		long sum = 0L;
		for (int i = 0; prime[i] <= 2000000; i++) {
			sum += prime[i];
		}
		System.out.println(sum);
	}
}
