package javastudyForBaekjoon;

import java.util.Scanner;

public class PrintN {
	
	public static void main(String args[]) {		
		
		Scanner input = new Scanner(System.in);
		int inputNum = input.nextInt();
		
		if(inputNum > 100000) {
			System.out.println("Too large number");
		}
		else {
			for(int n=0;n<inputNum;n++) {
				
				System.out.println(n+1);
			}
		}
	}
}