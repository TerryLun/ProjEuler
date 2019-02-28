package problems;

import java.math.BigInteger;

public class Problem20 {
	public static void calc() {
		BigInteger result = new BigInteger("1");
		for(int i=1;i<=100;i++) {
			BigInteger number = new BigInteger(Integer.toString(i));
			result = result.multiply(number);
		}
		String resultStr = result.toString();
		int total = 0;
		for (int i = 0; i < resultStr.length(); i++) {
			total += (resultStr.charAt(i)-'0');
		}
		System.out.println(total);
	}
}
