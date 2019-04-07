package javastudyForBaekjoon;

import java.util.Scanner;

public class SugarDelivery {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int finalCount = -1;
		int inputNum = scan.nextInt();
		int tCount = 0;	
		
		while(true) {					
			if(inputNum % 5 == 0 ) {	
				finalCount = (inputNum / 5) + tCount;
				break;			}
			
			if(inputNum < 3) {
				break;
			}
			else
			{
				inputNum -= 3;
				tCount++;
			}			
		}
		System.out.println(finalCount);
	}
}