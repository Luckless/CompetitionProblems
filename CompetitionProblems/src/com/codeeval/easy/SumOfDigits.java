package com.codeeval.easy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Sum Of Digits
 * {@link https://www.codeeval.com/open_challenges/21/} 
 * 
 * @author Dakota
 *
 */
public class SumOfDigits {
	public static void main(String args[]) {
		File file = new File(args[0]);
		Scanner input = null;
		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (input.hasNextInt()) {
			int i = input.nextInt();
			int sum = 0;
			for (int j = i; j > 0; j = j / 10) {
				sum += (j % 10);
			}
			System.out.println(sum);
		}
		return;
	}
}
