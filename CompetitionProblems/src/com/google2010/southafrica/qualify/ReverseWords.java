package com.google2010.southafrica.qualify;

import java.util.Scanner;

/**
 * Reverse Words
 * {@link https://code.google.com/codejam/contest/351101/dashboard#s=p1}
 * @author Dakota
 *
 */
public class ReverseWords {

  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();input.nextLine();
		int counter = 0;
		while(counter < cases){
			String[] s = input.nextLine().split(" ");
			String rev = "";
			for(int i = s.length - 1; i >= 0; i--){
				rev += s[i] + " ";
			}
			System.out.println("Case #" + (++counter) + ": " + rev.trim());
		}

	}
}
