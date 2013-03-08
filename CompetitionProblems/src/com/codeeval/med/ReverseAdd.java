package com.codeeval.med;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Jolly Jumpers 
 * {@link https://www.codeeval.com/open_challenges/45/} 
 * 
 * @author Dakota
 *
 */
public class ReverseAdd {
    
	public static void main(String[] args){


			Scanner scan;
			try {
				scan = new Scanner(new File(args[0]));

			while(scan.hasNext()){
				String init = scan.nextLine();
				ArrayList<Integer> beg = new ArrayList<Integer>();
				ArrayList<Integer> sum = new ArrayList<Integer>();
				
				for(int i = 0; i < init.length(); i++){
					beg.add(Integer.parseInt(Character.toString(init.charAt(i))));
				}
				
				int counter = 0;
				while(!isPal(beg) && counter <= 1000){
					counter++;
					int carry = 0;
					
					for(int i = beg.size() - 1; i > -1; i--){
						int value = beg.get(i) + beg.get(beg.size() - 1 - i) + carry;
						if(value > 9){
							carry = value / 10;
							value = value % 10;
						}
						else
							carry = 0;

						sum.add(value);
					}
					if(carry > 0){
						sum.add(carry);
					}
					Collections.reverse(sum);
					beg = new ArrayList<Integer>(sum);
					sum.clear();
				}
				
				System.out.print(counter + " ");
				for(int i = 0; i < beg.size(); i++){
					System.out.print("" + beg.get(i));
				}
				System.out.print("\n");
			}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		System.exit(0);
	}
	
	public static boolean isPal(ArrayList<Integer> al){
		boolean ispal = true;
		int j = al.size() - 1;
		for(int i = 0; i <= j; i++){
			if(al.get(i) != al.get(j--)){
				ispal = false;
				break;
			}
		}
		
		return ispal;
	}
}