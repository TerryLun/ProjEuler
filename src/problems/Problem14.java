package problems;

import java.util.HashSet;

public class Problem14 {
	public static void calc() {
		HashSet<Integer> set = new HashSet<>();
		int highChain = 0;
		for (int i = 999999; i > 1 ; i--) {
			int chain = calcChain(i,set);
			if (chain > highChain) {
				highChain = chain;
			}
		}
		System.out.println(highChain);
	}
	
	private static int calcChain(int i, HashSet<Integer> set) {
		
		return 0;
	}
}
