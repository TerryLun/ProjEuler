package main;

import java.io.IOException;
import java.util.HashSet;

import prime.PrimeCheck;
import prime.PrimeReader;
import problems.Problem50;

public class Main {

	public static void main(String[] args) throws IOException {

		long startTime = System.currentTimeMillis();

		Problem50.calc();
		
		long endTime = System.currentTimeMillis();
		System.out.println("\nRuntime: " + (endTime - startTime) + "ms");
	}
}
