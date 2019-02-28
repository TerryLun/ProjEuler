package problems;

import java.math.BigInteger;

public class Problem16 {
	public static void calc() {
		BigInteger base = new BigInteger("2");
		BigInteger result = base.pow(1000);
		String resultStr = result.toString();
		int total = 0;
		for (int i = 0; i < resultStr.length(); i++) {
			total += (resultStr.charAt(i)-'0');
		}
		System.out.println(total);
	}
}
