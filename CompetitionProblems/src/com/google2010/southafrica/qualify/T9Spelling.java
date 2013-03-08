package com.google2010.southafrica.qualify;

import java.util.Scanner;

/**
 * T9 Spelling 
 * {@link https://code.google.com/codejam/contest/351101/dashboard#s=p2}
 * 
 * @author Dakota
 * 
 */
public class T9Spelling {
	
	
	
	public static void main(String[] args) {
		
		String[] map = new String[26];

		map[0] = "2";
		map[1] = "22";
		map[2] = "222";
		map[3] = "3";
		map[4] = "33";
		map[5] = "333";
		map[6] = "4";
		map[7] = "44";
		map[8] = "444";
		map[9] = "5";
		map[10] = "55";
		map[11] = "555";
		map[12] = "6";
		map[13] = "66";
		map[14] = "666";
		map[15] = "7";
		map[16] = "77";
		map[17] = "777";
		map[18] = "7777";
		map[19] = "8";
		map[20] = "88";
		map[21] = "888";
		map[22] = "9";
		map[23] = "99";
		map[24] = "999";
		map[25] = "9999";
		
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();input.nextLine();
		int counter = 0;
		while (counter < cases) {
			String phrase = input.nextLine().toUpperCase();
			int previous = -1;
			
			String t9 = "";
			for(int i = 0; i < phrase.length(); i++){
				
				String numString;
				
				//check for a space
				if(phrase.charAt(i) == ' '){
					numString = "0";
				}else{
					numString = map[phrase.charAt(i)-'A'];
				}
				
				//get the number that was pressed
				int thisNum = Character.digit(numString.charAt(0), 10);
				//space appropriately
				if(previous == thisNum){
					t9 += " " + numString;
				}else{
					t9 += numString;
				}
				previous = thisNum;
			}
			
			System.out.println("Case #" + (++counter) + ": " + t9);
		}
	}
}
