package problems;

import java.io.IOException;

import prime.PrimeReader;

public class Problem12 {
	public static void calc() throws IOException {
		int[] prime = PrimeReader.getPrimeInt();
		long triNum = 0L;
		int high=0;
		for(int i=1;i<1000000000;i++) {
			triNum+=i;
			int totalDivisor=1;
			for(int j = 0; prime[j]<triNum;j++) {
				int exp = 1;
				if (triNum%prime[j]==0) {
					exp++;
					int thisPrime = prime[j];
					boolean ok = true;
					while(ok) {
						thisPrime *= thisPrime;
						if(triNum%thisPrime==0) {
							exp++;
						}else {
							ok=false;
						}
					}
					totalDivisor*=exp;
				}
			}
			if(totalDivisor>=500) {
				System.out.println(triNum+" ok");
			}
			if(i%1000==0) {
				System.out.println(triNum+ ": " +totalDivisor);
			}
			if(totalDivisor>high) {
				high=totalDivisor;
				System.out.println(high);
			}
		}
	}
}
