package prime;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class PrimeLib {
	public static void calc() throws IOException {
		final int SIZE = 1000000000;
		final int UPTO = (int) Math.sqrt(SIZE);
		int[] list = new int[SIZE];
		for (int i = 0; i < list.length; i++) {
			list[i] = 1;
		}

		list[0] = 0;
		list[1] = 0;
		for (int i = 2; i < UPTO; i++) {
			for (int j = 2; i * j < list.length; j++) {
				list[i * j] = 0;
			}
		}
		System.out.println("ok");

		BufferedWriter bw = null;
		File file = new File("lib/prime.dat");
		if (!file.exists()) {
			file.createNewFile();
		}
		try {
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < list.length; i++) {
			if (list[i] == 1) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		bw.close();
		System.out.println("done");
	}
}
