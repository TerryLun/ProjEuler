package prime;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class PrimeReader {

	static final String FILE_NAME = "lib/prime_upto_10m.dat";
	// lib/prime_upto_1m.dat
	// lib/prime_upto_10m.dat
	// lib/prime_upto_100m.dat
	// lib/prime_upto_1b.dat

	public static String[] getPrimeString() throws IOException {
		ArrayList<String> primeList = new ArrayList<>();
		BufferedReader reader = null;
		try {
			File file = new File(FILE_NAME);
			reader = new BufferedReader(new FileReader(file));

			String line;
			while ((line = reader.readLine()) != null) {
				primeList.add(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		reader.close();
		String[] array = primeList.toArray(new String[primeList.size()]);
		return array;
	}

	public static int[] getPrimeInt() throws IOException {
		ArrayList<Integer> primeList = new ArrayList<>();
		BufferedReader reader = null;
		try {
			File file = new File(FILE_NAME);
			reader = new BufferedReader(new FileReader(file));

			String line;
			while ((line = reader.readLine()) != null) {
				primeList.add(Integer.parseInt(line));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		reader.close();
		int[] array = new int[primeList.size()];
		Iterator<Integer> iterator = primeList.iterator();
		for (int i = 0; i < array.length; i++) {
			array[i] = iterator.next().intValue();
		}
		return array;
	}
}
