package problems;

import java.io.IOException;

import prime.PrimeCheck;
import prime.PrimeReader;

public class Problem50 {
	public static void calc() throws IOException {
		int[] primeArray = PrimeReader.getPrimeInt();
		int sum = 0;
		for(int i =0;i<=545;i++) {
			sum+=primeArray[i];
		}
		System.out.println(sum);
		for(int i = 545;i>=0;i--) {
			sum-=primeArray[i];
			if(PrimeCheck.check(sum)) {
				System.out.println(sum);
				break;
			}
		}
		
	}
}
