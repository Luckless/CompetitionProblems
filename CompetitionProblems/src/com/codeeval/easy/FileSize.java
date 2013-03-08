package com.codeeval.easy;

import java.io.*;
import java.util.Scanner;

/**
 * File Size
 * {@link https://www.codeeval.com/open_challenges/26/} 
 * 
 * @author Dakota
 *
 */
public class FileSize {
        public static void main(String args[]) {
                Scanner scan = new Scanner(args[0]);
                File file = new File(scan.next());
                long filesize = file.length();
                System.out.println(filesize);
                return;
        }
}