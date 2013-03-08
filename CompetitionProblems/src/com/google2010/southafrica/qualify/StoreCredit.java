package com.google2010.southafrica.qualify;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Store Credit {@link https
 * ://code.google.com/codejam/contest/351101/dashboard#s=p0}
 * 
 * @author Dakota
 * 
 */

public class StoreCredit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		int counter = 0;
		while (counter < cases) {
			int credit = input.nextInt();
			int[] items = new int[input.nextInt()];

			// get list of items
			for (int i = 0; i < items.length; i++) {
				items[i] = input.nextInt();
			}

			// use leftover change as key and the complementary item index as
			// value
			HashMap<Integer, Integer> leftover = new HashMap<Integer, Integer>();
			for (int i = 0; i < items.length; i++) {
				leftover.put(credit - items[i], i);
			}

			int a = 0, b = 0;
			for (int i = 0; i < items.length; i++) {
				// don't allow the same item to be selected twice
				if (leftover.containsKey(items[i])
						&& i != leftover.get(items[i])) {
					a = i + 1;
					b = leftover.get(items[i]) + 1;
					break;
				}
			}

			// index of both items adding up to credit amount
			System.out.println("Case #" + (++counter) + ": " + a + " " + b);
		}
	}
}
