package main;

import java.io.IOException;

import prime.PrimeReader;

public class Test {
	public static void calc(int number) throws IOException {
		int[] prime = PrimeReader.getPrimeInt();
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\nTotal count: " + count + "\n");

		int totalDivisor = 1;
		for (int j = 0; prime[j] < number; j++) {
			int exp = 1;
			if (number % prime[j] == 0) {
				exp++;
				int thisPrime = prime[j];
				boolean ok = true;
				while (ok) {
					thisPrime *= prime[j];
					if (number % thisPrime == 0) {
						exp++;
					} else {
						ok = false;
					}
				}
				System.out.println(prime[j] + "^" + (exp - 1));
				totalDivisor *= exp;
			}
		}
		System.out.println(totalDivisor);
	}
}
