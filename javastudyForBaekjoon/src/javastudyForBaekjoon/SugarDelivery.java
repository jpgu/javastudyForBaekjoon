package javastudyForBaekjoon;

import java.util.Scanner;

public class SugarDelivery {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int finalCount = -1;
		int inputNum = scan.nextInt();
		
		if(inputNum % 5 == 0) {			
			finalCount = inputNum / 5;
		}
		else if((inputNum % 5) % 3 == 0) {
			System.out.println("case 2");
			finalCount = (inputNum / 5) + ((inputNum % 5) / 3);
		}
		else if(inputNum % 3 == 0){
			System.out.println("case 3");
			finalCount = inputNum / 3;
		}
		else {
			int count = (inputNum / 5) -1;		
			System.out.println("case 4");
			while(count > 0) {				
				if((inputNum - (5*count)) % 3 == 0) {			
					finalCount = count + ((inputNum - (5*count)) / 3);
					break;
				}
				else {
					count--;
				}
			}			
		}
		
		System.out.println(finalCount);
	}
}
