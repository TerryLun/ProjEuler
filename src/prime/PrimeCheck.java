package prime;

import java.io.IOException;
import java.util.HashSet;

public class PrimeCheck {
	public static boolean check(int number) throws IOException {
		HashSet<Integer> primeSet = new HashSet<>();
		primeSet = PrimeReader.getPrimeSet();
		if(primeSet.contains(number)) {
			return true;
		}
		return false;
	}
}
