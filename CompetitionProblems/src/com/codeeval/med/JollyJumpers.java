package com.codeeval.med;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Jolly Jumpers 
 * {@link https://www.codeeval.com/open_challenges/43/}
 * 
 * @author Dakota
 *
 */

public class JollyJumpers {

    public static void main(String args[]){
		Scanner scan;
		try {
			scan = new Scanner(new File(args[0]));
		
		
		while(scan.hasNext()){
			String[] temp = scan.nextLine().split(" ");
			int[] jumpers = new int[temp.length];
			for(int i = 0; i < temp.length; i++){
				jumpers[i] = Integer.parseInt(temp[i]);
			}
			boolean jolly = true;
			
			if(jumpers[0] != 1){
				
				HashSet<Integer> results = new HashSet<Integer>();
				for(int i = 1; i < jumpers.length - 1; i++){
					results.add(Math.abs(jumpers[i] - jumpers[i + 1]));
				}
				
				int counter;
				for(counter = 1; counter < jumpers[0]; counter++){
					if(!results.contains(counter)){
						jolly = false;
						break;
					}
				}
			}
			
			System.out.println((jolly) ? "Jolly" : "Not jolly");
		}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);
	}
}
