package problems;

public class Problem9 {
	public static void calc() {
		final int TOTAL_SUM = 1000;
		boolean found = false;
		for (int a = 1; a < TOTAL_SUM; a++) {
			for (int b = 1; a + b <= 1000; b++) {
				int c = TOTAL_SUM - b - a;
				if ((a * a + b * b == c * c) && (found == false)) {
					System.out.print("a = " + a);
					System.out.print(", b = " + b);
					System.out.println(", c = " + c);
					System.out.println("Product = " + a * b * c);
					System.out.println();
					found = true;
				}
			}
		}
	}
}
