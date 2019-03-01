package main;

import java.io.IOException;

import problems.Problem20;

public class Main {

	public static void main(String[] args) throws IOException {

		long startTime = System.currentTimeMillis();

		Problem20.calc();

		long endTime = System.currentTimeMillis();
		System.out.println("\nRuntime: " + (endTime - startTime) + "ms");
	}
}
