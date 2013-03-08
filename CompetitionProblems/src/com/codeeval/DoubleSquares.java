package com.codeeval;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
  * Double Squares
 * {@link https://www.codeeval.com/open_challenges/33/}  
 * 
 * @author Dakota
 *
 */

public class DoubleSquares {

    public static void main(String[] args) {
		Scanner in = null;
		try {
			in = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long limit = 2147483647;
		int maxNumber = (int) Math.sqrt(limit) + 1;
		long[] squares = new long[maxNumber];

		for (int i = 0; i < maxNumber; i++) {
			squares[i] = i * i;
		}

		while (in.hasNext()) {
			int inputs = in.nextInt();
			for (int i = 0; i < inputs; i++) {
				long number = in.nextInt();

				int pos1 = 0;

				int pos2 = (int) Math.sqrt(number);
				int count = 0;
				while (pos1 <= pos2) {
					if (squares[pos1] + squares[pos2] > number) {

						pos2--;
					} else if (squares[pos1] + squares[pos2] < number) {

						pos1++;
					} else {

						count++;

						pos1++;
						pos2--;
					}
				}
				System.out.println(count);
			}
		}
		System.exit(0);
	}
}