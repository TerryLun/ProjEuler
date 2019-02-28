package problems;

import java.util.HashSet;

public class Problem14 {
	public static void calc() {
		HashSet<Integer> set = new HashSet<>();
		int highChain = 0;
		long highNumber = 0;
		for (long i = 999999L; i > 1 ; i--) {			
			int temp = (int)i;
			if (!set.contains(temp)){
				int count = 0;
				count = calcChain(i,set);
				if (count > highChain) {
					highChain = count;
					highNumber = i;
				}
			}
		}
		System.out.println(highNumber + " with " + highChain);
	}
	
	private static int calcChain(long number, HashSet<Integer> set) {
		int count=0;
		while(number!=1) {
			count++;
			if(number<=1000000) {
				set.add((int)(number));
			}
			if(number%2==0) {
				number=number/2;
			}else {
				number=number*3+1;
			}
		}
		return count;
	}
}
